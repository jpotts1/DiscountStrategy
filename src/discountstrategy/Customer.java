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
public class Customer {
    
    private String CustomerLastname;
    private String CustomerFirstname;
    private String CustomerNumber;

    public Customer(String lastName, String firstName, String accountNo) {
        this.CustomerLastname = CustomerLastname;
        this.CustomerFirstname = CustomerFirstname;
        this.CustomerNumber = CustomerNumber;
    }

    public String getCustomerLastname() {
        return CustomerLastname;
    }

    public void setCustomerLastname(String CustomerLastname) {
        this.CustomerLastname = CustomerLastname;
    }

    public String getCustomerFirstname() {
        return CustomerFirstname;
    }

    public void setCustomerFirstname(String CustomerFirstname) {
        this.CustomerFirstname = CustomerFirstname;
    }

    public String getCustomerNumber() {
        return CustomerNumber;
    }

    public void setCustomerNumber(String CustomerNumber) {
        this.CustomerNumber = CustomerNumber;
    }
            
 
}
