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
public class CreditCardCustomer implements Customer{
        
 
    private String customerNumber;
    private String firstName;
    private String lastName;

    public CreditCardCustomer(String customerNumber, String firstName, String lastName){
        this.customerNumber = customerNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    @Override
    public String getCustomerInfo(){
        return firstName + " " + lastName;
    }
    
    
    public String getCustomerNumber() {
        return customerNumber;
    }
    
     /**
     * @param customerNumber - Customer number is stored.
     * @throws IllegalArgumentException if customerId is null or empty
     */
    
    public void setCustomerNumber (String customerNumber) {
        if(customerNumber == null || customerNumber.isEmpty()){
            throw new IllegalArgumentException("Invalid customer number.");
        }
        this.customerNumber = customerNumber;
    }
 
    /**
     * Stores the customers first name.
     * @param firstName - First Name is stored.
     * @return 
     * @throws IllegalArgumentException if firstName is empty or missing.
     */

    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        if(firstName.isEmpty()){
            throw new IllegalArgumentException("Must enter first name.");
        }
        this.firstName = firstName;
    }

    /**
     * Stores the customer last name.
     * @param lastName - Last Name is stored.
     * @return 
     * @throws IllegalArgumentException if lastName is empty or missing. 
     */
    
       public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        if(lastName.isEmpty()){
            throw new IllegalArgumentException("Must enter last name.");
        }
        this.lastName = lastName;
    }

    
}
