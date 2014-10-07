
package discountstrategy;

/**
 * This is the percentage discount that implements from the discount type interface.
 * Calculates a discount based on passed arguments. 
 * 
 * @author justinpotts
 * @version 1.00
 */
public class PercentDiscountStrategy implements DiscountType {
    public double getDiscountAmount(double price, double discountRate) {
        if(price < .01 || discountRate < .01){
            throw new IllegalArgumentException("Price and discount must be at least"
                    + ".01.");
        }
        return price * discountRate;
    }
    
        @Override
    public double getDiscountedPrice(double price, double discount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
