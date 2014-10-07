
package discountstrategy;

/**
 * This is the class for the register.
 * This class takes items, discounts and prints the receipt. 
 * The Register is for managing the sale and looking up product and customer
 * information from the database. 
 * Methods: StartSale, AddItems, Print receipt
 * 
 * @author justinpotts
 * @version 1.00
 */

public class Register {
    private Sale sale;
    private Database db;

    public Register(Database db){
        this.db = db;
    }
    
    /**
     * Creates a new Order object and looks up the Customer based on customerId
     * @param customerNumber
     * @param customerId - String to pass to DataAccessStrategy object
     */
    public void startNewSale(String customerNumber){
        sale = new Sale(db.getCustomer(customerNumber));
        //receipt = new Receipt(writer);
        //receipt.setCustomer(fd.getCustomer(customerId));
    }
    
    /**
     * Calls the Order object's addItem method and looks up a Product based
     * on productId. Passes Product object and qty to addItem method.
     * @param productId - String to pass to DataAccessStrategy object
     * @param qty - quantity of Product
     * @throws IllegalArgumentException if qty is less than 1.
     */
    public void addItem(String productId, int qty){
        if(qty < 1){
            throw new IllegalArgumentException("Quantity must be at least 1.");
        }
        sale.addItem(db.getProduct(productId), qty);
        //receipt.addItem(fd.getProduct(productId), qty);
    }

    void endSaleAndPrintReceipt(GUIReceipt guiReceipt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
