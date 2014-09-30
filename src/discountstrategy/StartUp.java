
package discountstrategy;


import discountstrategy.Register;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author justinpotts
 */
public class StartUp {
    public static void main(String[] args) {
    
    Register r = new Register();
    
    r.startSale("1622");
    
    r.displayReceipt();
    

    }
  

}
