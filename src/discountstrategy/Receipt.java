package discountstrategy;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This is the receipt. It has the formatted version of the receipt. 
 * Main method: PrintReceipt
 * 
 * @author justinpotts
 * @version 1.00
 */
public class Receipt {
    
    Date date;
    
    public Receipt(){
        date = new Date();
    }
    
    
        public void printReceipt(ReceiptType writer, Customer customer, LineItem[] items, double taxRate){
        String format = "%-20s %-15s %-15s %-15s %-20s%n";
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String formattedReceipt = "Kohl's Department Store\n" + customer.getCustomerInfo() + "\n";
        double subTotal = 0;
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        formattedReceipt += dateFormat.format(date) + "\n\n";
        formattedReceipt += String.format(format, "Description", "Quantity", "Price", "Discount", "Ext Price");
        formattedReceipt += "------------------------------------------------------------------------------\n";
        for(LineItem li : items){
            formattedReceipt += li.toString(format, nf) + "\n";
            subTotal += (li.getPrice() - li.getDiscount());
        }
        formattedReceipt += String.format(format, "", "", "", "SubTotal:", nf.format(subTotal));
        formattedReceipt += String.format(format, "", "", "", "Tax:", nf.format(subTotal * taxRate));
        formattedReceipt += String.format(format, "", "", "", "Total:", nf.format(subTotal + (subTotal * taxRate)));
        formattedReceipt += "Thank you for shopping at Kohl's!\n";
        writer.outputString(formattedReceipt);
    }
}
