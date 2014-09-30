
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
public class Register {
        private Reciept reciept;

        public void startSale(String CustomerNumber) {
        reciept = new Reciept(CustomerNumber);
    }
        
        public void addNewLineItem(String productId, double qty) {
        reciept.addLineItem(productId, qty);

    }
        
        public void displayReceipt() {
        System.out.println(reciept.getReceipt());
    }
        
}
