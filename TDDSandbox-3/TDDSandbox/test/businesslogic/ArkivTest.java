//@ Cathrine, Cassandra, Kristine og Sofia
package businesslogic;

import java.io.IOException;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import presentation.FakeUI;


public class ArkivTest {
    @Test
    public void testArkiv() throws IOException{
        //arrange
         ArrayList<Pizza> menukort = new ArrayList();
         menukort.add(new Pizza(1, "Vesuvio", 57.0));
         menukort.add(new Pizza(2, "Amerikaner", 53.0));
         menukort.add(new Pizza(3, "Cacciatore", 57.0));
         menukort.add(new Pizza(4, "Carbona", 63.0));
         menukort.add(new Pizza(5, "Dennis", 65.0));
         menukort.add(new Pizza(6, "Bertil", 57.0));
         menukort.add(new Pizza(7, "Silvia", 61.0));
         menukort.add(new Pizza(8, "Victoria", 61.0));
         menukort.add(new Pizza(9, "Toronfo", 61.0));
         menukort.add(new Pizza(10, "Capricciosa", 61.0));
         menukort.add(new Pizza(11, "Hawai", 61.0));
         menukort.add(new Pizza(12, "Le Blissola", 61.0));
         menukort.add(new Pizza(13, "Venezia", 61.0));
         menukort.add(new Pizza(14, "Mafia", 61.0));
         String[] input = {"3","1"}; // test input data
         FakeUI ui = new FakeUI(input);
         Controller ctrl = new Controller(ui, menukort);
         Bestilling b = new Bestilling(menukort.get(0),1);
         ctrl.opretBestilling();
         
        //act
        ctrl.gemIArkiv(b);
        
        //assert
       //assertTrue();
    }
}
