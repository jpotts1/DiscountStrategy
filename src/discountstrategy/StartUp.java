package discountstrategy;
import discountstrategy.Register;

/**
 *
 * @author justinpotts
 */

public class StartUp {
   
    public static void main(String[] args) {
        
        Register r = new Register(new FakeDB());
        
        // Sale 
        r.startNewSale("2635");
        
        r.addItem("f211", 1);
        
        r.endSaleAndPrintReceipt(new GUIReceipt());
        
        // Sale 
        r.startNewSale("16122");
        
        r.addItem("a101", 1);
        r.addItem("b929", 1);
        
        r.endSaleAndPrintReceipt(new GUIReceipt());
    }
    
}