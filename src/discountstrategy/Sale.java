package discountstrategy;

/**
 *
 * @author justinpotts
 * @version 1.00
 */
public class Sale {
    private Receipt receipt;
    private Customer customer;
    private LineItem[] item;
    
      public Sale(Customer customer){
        item = new LineItem[0];
        receipt = new Receipt();
        this.customer = customer;
    }
      
    /**
     * Adds a new LineItem object to the LineItem[] array
     * @param p - Product object 
     * @param qty - quantity of product
     */
    public void addItem(Product p, int qty){
        LineItem[] temp = new LineItem[item.length + 1];
        System.arraycopy(item, 0, temp, 0, item.length);
        temp[item.length] = new LineItem(p.getProductId(), p.getProductDescription(), p.getUnitPrice() * qty, qty, p.getDiscountAmount() * qty);
        item = temp;
    }

    /**
     * Calls the Receipt object's printReceipt method
     * @param writer - ReceiptOutput object to use
     * @param taxRate
     * @throws NullPointerException if ReceiptOutput argument is null.
     */
    
    public void printReceipt(ReceiptType writer, double taxRate){
        if(writer == null){
            throw new NullPointerException("ReceiptOutput object must not be null.");
        }
        receipt.printReceipt(writer, customer, item, taxRate);
    }

    public Receipt getReceipt() {
        return receipt;
    }
    
    /**
     * Stores Receipt object.
     * @param receipt - Receipt object to store.
     * @throws NullPointerException if argument is null
     */
    public void setReceipt(Receipt receipt) {
        if(receipt == null){
            throw new NullPointerException("Receipt must not be null.");
        }
        this.receipt = receipt;
    }

    public Customer getCustomer() {
        return customer;
    }
    
    /**
     * Stores Customer object.
     * @param customer - Customer object to store.
     * @throws NullPointerException if argument is null
     */
    public void setCustomer(Customer customer) {
        if(customer == null){
            throw new NullPointerException("Customer must not be null.");
        }
        this.customer = customer;
    }
    
}


