package discountstrategy;

/**
 * This is the cash customer class. It implements from the customer interface.
 * Stores information for a cashCustomer. It first sets a custom number. 
 * Then Gets customerNumber, and sets customerNumber. 
 * 
 * @author justinpotts
 * @version 1.00
 */

public class CashCustomer implements Customer {
    
    private String customerNumber;
    
    public CashCustomer(String customerNumber){
        this.customerNumber = customerNumber;
    }
     
    public String getCustomerNubmer() {
        return customerNumber;
    }


    /**
     * @param customerNumber - Customer number is stored.
     * @throws IllegalArgumentException if customerId is null or empty
     */
    
    @Override
    public void setCustomerNumber (String customerNumber) {
        if(customerNumber == null || customerNumber.isEmpty()){
            throw new IllegalArgumentException("Invalid customer Id.");
        }
        this.customerNumber = customerNumber;
    }

    @Override
    public String getCustomerNumber() {
        return "";
    }
    
     @Override
    public String getCustomerInfo(){
        return "";
    }


}
