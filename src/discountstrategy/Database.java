package discountstrategy;

/**
 * This class makes templates for finding customer and products ojbects.
 * @author justinpotts
 */

public interface Database {
       public Customer getCustomer(String customerId);
       public Product getProduct(String productId);
       
}
