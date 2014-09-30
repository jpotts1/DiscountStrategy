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
public abstract class FlatRate implements DiscountType {
    
    private double baseRate = 0.25;
    private double price;
    private double qty;
    private double min;
    private double baseAmount;

    @Override
    public double getDiscount() {
        return baseRate * qty * getPrice();
    }

    @Override
    public double getBaseRate() {
        return baseRate;
    }

    @Override
    public void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getQty() {
        return qty;
    }

    @Override
    public void setQty(double qty) {
        this.qty = qty;
    }

    @Override
    public double getMin() {
        return min;
    }

    @Override
    public void setMin(double min) {
        this.min = min;
    }
    
    @Override
    public String toString() {
        return "Xmas Discount";
    }

    public double getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(double baseAmount) {
        this.baseAmount = baseAmount;
    }
    

    public static void main(String[] args) {
        DiscountType discount = new FlatRate() {};
        discount.setBaseRate(.10);
        discount.setPrice(25.00);
        discount.setQty(20);
        
        double amt = discount.getDiscount();
        System.out.println("The discount is: " + amt);        
    }
    

}
