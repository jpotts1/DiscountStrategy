/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

import java.text.NumberFormat;

/**
 *
 * @author justinpotts
 */
public class Reciept {
    public static final int ID_MAX_LEN = 5;
    public static final int PROD_MAX_LEN = 30;
    public static final int QTY_MAX_LEN = 5;
    public static final int DISCOUNT_MAX_LEN = 10;
    public static final int AMT_MAX_LEN = 10;

    private Customer customer;
    private LineItem[] lineItems = new LineItem[0];
    private Object customerNumber;

    public Reciept(String accountNo) {
        customer = this.findCustomer(accountNo);
        if(customer == null) {
            customer = new Customer("Unknown", "Unknown", "Unknown");
        }
    }

  
    public void addLineItem(String prodId, double qty) {
        LineItem[] temp = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, temp, 0, lineItems.length);
        temp[temp.length-1] = new LineItem(prodId, qty);
        lineItems = temp;
    }

    public String getReceipt() {
        double totalDue = 0.0;
        double totalDiscount = 0.0;
        String Receipt = "SOLD TO:\n" + customer.toString() + "\n\n";
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        Receipt += pad("ID", ID_MAX_LEN) +" ";
        Receipt += pad("Product", PROD_MAX_LEN) +" ";
        Receipt += pad("Qty", QTY_MAX_LEN) +" ";
        Receipt += pad("Price", AMT_MAX_LEN) +" ";
        Receipt += pad("Discount", DISCOUNT_MAX_LEN) +" ";
        Receipt += pad("Ext. Price", AMT_MAX_LEN) +"\n";

        Receipt += "----------------------------------------------------------------------------\n";

        for(LineItem item : lineItems) {
            Receipt += item.toString() + "\n";
        }

        for(LineItem item : lineItems) {
            totalDue += item.getLineItemTotal();
            totalDiscount += item.getTotalDiscount();
        }

        Receipt += "\n-----------------------";

        Receipt += "\nTotal Amount Due: ";
        Receipt += nf.format(totalDue);
        Receipt += "\nTotal Discount: ";
        Receipt += nf.format(-totalDiscount);


        return Receipt;
    }


    private Customer findCustomer(String CustomerNumber) {
        

        for(Customer c : FakeDatabase.customers) {
            if(c.getCustomerNumber().equals(CustomerNumber)) {
               customer = c;
               break;
            }
        }

        return customer;
    }

    public static final String pad(String value, int maxLength) {
        int diff = maxLength - value.length();
        String padded = "";

        for(int i=0; i < diff; i++) {
            padded += " ";
        }

        return padded + value;
    }
}
