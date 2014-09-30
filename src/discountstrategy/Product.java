
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
public class Product {
    private String id;
    private String name;
    private double unitCost;
    private DiscountType[] discounts = new DiscountType[0];
    
     public Product() {
    }
     

        
        public DiscountType[] getDiscounts() {
        return discounts;
    }
        public void setDiscounts(DiscountType[] discounts) {
        this.discounts = discounts;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public String toString() {
    return id + ", " + name + ", " + unitCost;
    }

}
