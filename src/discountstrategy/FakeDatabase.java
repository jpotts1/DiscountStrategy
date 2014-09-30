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
public class FakeDatabase {
 
    public static final Product[] products = new Product[5];
    public static final Customer[] customers = new Customer[3];
    
       static {
       
       products[0] = new Product("2112", "Undershirt 5 pack", 20.00);
        products[0].addDiscount(new Percentage(){

            @Override
            public double getBaseRate() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void setBaseRate(double baseRate) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        products[1] = new Product("1276", "Nike Shoes", 60.00);
        products[1].addDiscount(new FlatRate() {});
     

        products[2] = new Product("9090", "Womens Dress", 25.00);
        products[2].addDiscount(new Quantity());
        
        products[3] = new Product("2344", "5 Gum", 3.00);
        products[3].addDiscount(new Quantity());
        
        products[4] = new Product("3523", "Brewers Hat", 22.00);
        products[4].addDiscount(new FlatRate() {});
        

        customers[0] = new Customer("Potts", "Justin", "1622");
        customers[1] = new Customer("Saeger", "Kelly", "2635");
        customers[2] = new Customer("Rogders", "Aaron", "1212");


        
    }

}
