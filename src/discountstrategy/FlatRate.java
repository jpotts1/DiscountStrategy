package discountstrategy;


/**
 * This class is the flat rate discount strategy. This class implements from 
 * discountType interface.
 * 
 * @author justinpotts
 * @version 1.00
 */

public class FlatRate implements DiscountType {
    public double getDiscountAmount(double price, double discountAmount){
        if(price < .01 || discountAmount < .01){
            throw new IllegalArgumentException("Price and discount must be at least"
                    + ".01.");
        }
        return discountAmount;
    }

    @Override
    public double getDiscountedPrice(double price, double discount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}