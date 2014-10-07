package discountstrategy;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 * This class implements receipt. 
 * Outputs a string to a GUI box. 
 * 
 * @author justinpotts]
 * @version 1.00
 */
public class GUIReceipt implements ReceiptType {
      
    @Override
    public void outputString(String s) {
        JOptionPane.showMessageDialog(null, s);
    }
}
