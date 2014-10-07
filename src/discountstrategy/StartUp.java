package discountstrategy;
import discountstrategy.Register;

/**
 *
 * @author justinpotts
 */

public class StartUp {
   
    public static void main(String[] args) {
        
        Register r = new Register(new FakeDB());
        
        // Sale 1
        r.startNewSale("2635");
        
        r.addItem("A101", 1);

        
        r.endSaleAndPrintReceipt(new GUIReceipt());
    }
    
}