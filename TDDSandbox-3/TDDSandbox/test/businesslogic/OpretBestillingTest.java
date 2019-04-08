//@ Cathrine, Cassandra, Kristine og Sofia
package businesslogic;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import presentation.FakeUI;

public class OpretBestillingTest {
       
     @Test
     public void opretBestillingToPizza() {
         /*
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
         String[] input = {"2","4"}; // test input data
         FakeUI ui = new FakeUI(input);
         Controller ctrl = new Controller(ui, menukort);
         
         //act
         ctrl.opretBestilling();
         ctrl.opretBestilling();
         
         //assert
         assertEquals("1", ui.output.get(1)); //1 er ordrenr(string)
         assertEquals("2", ui.output.get(2));
         //teste om pizza nr 2 var en amerikaner
         //assertTrue(ui.output.get(1).contains("Amerikaner"));
         //assertTrue(ui.output.get(3).contains("Carbona"));
         //teste om der er den ene bestilling man har lagt i
         //assertTrue(ctrl.getAktiveOrdrer().size()==2);
         
         //
         //assertEquals("Amerikaner", ctrl.getAktiveOrdrer().get(0).getPizza().getPizzaNavn());
         //assertEquals("Carbona", ctrl.getAktiveOrdrer().get(0).getPizza().getPizzaNavn());*/
               
     }
     
      @Test
     public void opretBestillingEnPizza() {
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
         
         String[] input = {"2"}; // test input data
         FakeUI ui = new FakeUI(input);
         Controller ctrl = new Controller(ui, menukort);
         
         //act
         ctrl.opretBestilling();
         
         //assert
         assertEquals("1", ui.output.get(1)); 
         //teste om pizza nr 2 var en amerikaner
         assertTrue(ui.output.get(2).contains("Amerikaner"));
         //teste om der er den ene bestilling man har lagt i
         assertTrue(ctrl.getAktiveOrdrer().size()==1);
         //
         assertEquals("Amerikaner", ctrl.getAktiveOrdrer().get(0).getPizza().getPizzaNavn());
}
}
