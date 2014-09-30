
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
public interface DiscountType {
    
    double getBaseRate();

    double getDiscount();

    double getMin();

    double getPrice();

    double getQty();

    void setBaseRate(double baseRate);

    void setMin(double min);

    void setPrice(double price);

    void setQty(double qty);

    @Override
    String toString();
}
