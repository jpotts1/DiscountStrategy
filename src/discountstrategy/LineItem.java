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
public class LineItem {
    private Product product;
    private double qty;

    public LineItem(String id, double qty) {
        this.product = findProduct(id);
        this.qty = qty;
    }
    
    public double getTotalDiscount() {
        return (product.getTotalDiscount(qty));
    }

    public double getLineItemTotal() {
        return (product.getUnitCost() * qty - getTotalDiscount());
    }
    
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    private Product findProduct(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
