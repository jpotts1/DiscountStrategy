package discountstrategy;

/**
 * This is the class for the product. Containing all product information. 
 * Also it is responsible for the discounts. 
 * 
 * @author justinpotts
 * @version 1.00
 */

public class Product {
    private String productId;
    private double productNumber;
    private double unitPrice;
    private double discount;
    private String desc;
    private DiscountType dt;
    
    public Product(DiscountType dt, String productId, String desc, double unitPrice, double discount){
        this.dt = dt;
        this.productId = productId;
        this.productNumber = productNumber;
        this.desc = desc;
        this.unitPrice = unitPrice;
        this.discount = discount;
        
    }
    
    public double getDiscountAmount(){
        return dt.getDiscountedPrice(unitPrice, discount);
    }

    public double getDiscount() {
        return discount;
    }
    
    /**
     * Stores the discount
     * @param discount - stores the double for discount. 
     * @throws IllegalArgumentException if discount is not at least 0.
     */
    
    public void setDiscount(double discount) {
        if(discount < 0){
            throw new NullPointerException("Discount must be at least 0.");
        }
        this.discount = discount;
    }

    /**
     * Stores the discountTpye DT. 
     * @param dt - discount Type to store.
     */
    
    public void setDs(DiscountType dt) {
        this.dt = dt;
    }
    
    public DiscountType getDt() {
        return dt;
    }

    /**
     * Stores the string for the product id.
     * @param productId - String to store
     * @throws IllegalArgumentException if productId is missing. 
     */
    
    public void setProductId(String productId) {
        if(productId.equals("")){
            throw new NullPointerException("Product Id is invalid.");
        }
        this.productId = productId;
    }
    
    public String getProductId() {
        return productId;
    }
    
    /**
     * Stores the description String
     * @param desc - Stores the string for description. 
     * @throws IllegalArgumentException if description is missing.
     */
    
    public void setDesc(String desc) {
        if(desc.equals("")){
            throw new NullPointerException("Description is invalid.");
        }
        this.desc = desc;
    }
    
    public String getDesc() {
        return desc;
    }
    
     /**
     * Stores the unitPrice
     * @param unitPrice - stores the price.
     * @throws IllegalArgumentException if the price is below 0.
     */
   
    public void setUnitPrice(double unitPrice) {
        if(discount < 0){
            throw new NullPointerException("Should have price of at least 0.");
        }
        this.unitPrice = unitPrice;
    }
    
    public double getUnitPrice() {
        return unitPrice;
    }

    String getProductDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
