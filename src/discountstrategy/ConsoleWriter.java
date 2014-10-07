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
public class ConsoleWriter implements Writer {

        /**
     * Outputs a string to the console.
     * @param s - String to output
     * @throws NullPointerException if s is null or empty
     */
    
    @Override
    public void outputString(String s) {
        if(s == null || s.isEmpty()){
            throw new NullPointerException("A null or empty string is not valid.");
        }
        System.out.println(s);
    }

}
