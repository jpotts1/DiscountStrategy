
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author justinpotts
 * @version 1.00
 */



public interface DiscountType {
    
/**
* Provides interface for getting the discounted price.
* @param price - Product price for calculation
* @param discount - Discount price for calculation
* @return - returns the discounted price as a double
*/
    public abstract double getDiscountedPrice(double price, double discount);

}
