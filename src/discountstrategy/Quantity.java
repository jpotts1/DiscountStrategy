
package discountstrategy;

/**
 *
 * @author justinpotts
 */

public abstract class Quantity implements DiscountType {
    private double rate = 0.10;
    private double price;
    private double qty;
    private double min = 5;
    
    public double getDiscount() {
        double discount = 0;

        if(qty >= getMin()) {
            discount = rate * price * qty;
        }
        return discount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }



    public String toString() {
        return "Quantity Discount";
    }
}


