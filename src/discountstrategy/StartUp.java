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
        r.startNewSale("B122");
        
        r.addItem("11039", 2);
        r.addItem("12045", 1);
        r.addItem("11078", 1);
        r.addItem("11078", 1);
        
        r.endSaleAndPrintReceipt(new GUIReceipt());
    }
    
}