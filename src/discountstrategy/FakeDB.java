package discountstrategy;

/**
 * This class is a fake database that is used to store fake customers and fake 
 * products. This is what is used on the receipt.
 * 
 * @author justinpotts
 * @version 1.00
 */

public class FakeDB implements Database {

    //This is an array of fake customers. 
    private final Customer[] customers = {new CashCustomer("029"),
                                    new CashCustomer("222"),
                                    new CreditCardCustomer("1622", "Justin", "Potts"),
                                    new CreditCardCustomer("2635", "Kelly", "Saeger")};
    
    // This is an array of fake products. 
    private final Product[] products = {new Product(new FlatRate(), "A101", "Nike Shoes", 69.99, 10.00), 
                                  new Product(new Percentage(), "S212", "Sweater", 29.99, 0.15),
                                  new Product(new Percentage(), "J222", "Jeans", 29.99, 0.15),
//                                  new Product(new Quantity(), "G622", "Five Gum", 2.99, 2.00),
                                  new Product(new FlatRate(), "F211", "Packer Jersey", 89.99, 20.00),
                                  new Product(new Percentage(), "B929", "Mens Belt", 9.99, 0.15)
    };
    
    
      private double taxRate = 0.05;
      
    // Get the customers number
    @Override
    public Customer getCustomer(String customerNumber){
        
        for(Customer c : customers){
            if(c.getCustomerNumber().equals(customerNumber)){
                return c;
            }
        }
        return null;
        
    }
    // Get product id
    @Override
    public Product getProduct(String productId){
        
        for(Product p : products){
            if(p.getProductId().equals(productId)){
                return p;
            }
        }
        
        return null;
    }
    

    public double getTaxRate(){
        return taxRate;
    }
}
