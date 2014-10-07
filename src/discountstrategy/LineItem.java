package discountstrategy;

import java.text.NumberFormat;

/**
 * This class stores all the information for a Line Item.
 * 
 * @author justinpotts
 * @version 1.00
 */

public class LineItem {
    
    private final String productId;
    private final String productDescription;
    private final double price;
    private final int qty;
    private final double discount;
    
     public LineItem(String productId, String description, double unitPrice, int qty, double discount) {
        this.productId = productId;
        this.productDescription = description;
        this.price = unitPrice;
        this.qty = qty;
        this.discount = discount;
    }
//      
//    public String getProductId() {
//        return productId;
//    }
//    
    public double getPrice() {
        return price;
    }
      
    public double getDiscount() {
        return discount;
    }
    
    
        public String toString(String format, NumberFormat nf){
        if(nf == null || format == null || format.isEmpty()){
            throw new NullPointerException("NumberFormat and String arguments"
                    + "must not be null or empty.");
        }
        return String.format(format, productDescription, qty, nf.format(price), nf.format(discount), nf.format(price - discount));
//        return description + "      " + qty + "       " + price + "      " + discount + "      " + (price - discount);
    }
//    public double getQty() {
//    return qty;
//    }
//
//    public String getDescription() {
//    return productDescription;}
    
      
     /**
     * Creates a string using the line item and returns it. 
     * 
     * @param format - String for String.format()
     * @param nf - NumberFormat object
     * @return 
     */
    
}
