/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author justinpotts
 */
public abstract class Percentage implements DiscountType {
    private double percentOff = 0.25;
    private double price;
    private double qty;
    private double min;
    private double baseAmount;
    
    @Override
    public double getDiscount() {
        return percentOff * qty * getPrice();
    }

    public double getPercentOff() {
        return percentOff;
    }

    public void setPercentOff(double percentOff) {
        this.percentOff = percentOff;
    }

    @Override
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

    public double getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(double baseAmount) {
        this.baseAmount = baseAmount;
    }
    
     public static void main(String[] args) {
        DiscountType discount = new Percentage() {

            @Override
            public double getBaseRate() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void setBaseRate(double baseRate) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        discount.setBaseRate(.10);
        discount.setPrice(25.00);
        discount.setQty(20);
        
        double amt = discount.getDiscount();
        System.out.println("The discount is: " + amt);        
    }
    
    
    
}
