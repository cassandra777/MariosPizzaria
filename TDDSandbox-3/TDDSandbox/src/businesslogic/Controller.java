//@ Cathrine, Cassandra, Kristine og Sofia
package businesslogic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import presentation.UI;
import businesslogic.DBFacade;

public class Controller {
    
    private UI ui;
    private ArrayList<Pizza> menukort;
    private ArrayList<Bestilling> aktiveOrdrer; //pga den her skal der laves en ny arrayliste
    private int currentOrderNr;

    public Controller(UI ui, ArrayList<Pizza> menukort) {
        this.ui = ui;
        this.menukort = menukort;
        aktiveOrdrer = new ArrayList<Bestilling>();
        currentOrderNr=1;
    }
    
      public void start() {
          boolean quit = false;
          ui.visHovedmenu();
          
          do{
              String brugerInput = ui.hovedMenuValg();
              switch(brugerInput){
                  case "1":
                      visMenukort();
                      break;
                  case "2":
                      opretBestilling();
                      break;
                  case "3":
                      visOrdrer();
                      break;
                  case "4":
                      fjernOrdre();
                      break;
                  case "5":
                      quit=true;
                      break;
                  default:
                      throw new IllegalArgumentException();
              }
              
          } while (!quit);
    }

    public void opretBestilling() {
        // indlæs pizzanummer
        int pizzaNummer = ui.vælgPizza(); 
          // opret bestilling
        Bestilling bestilling = new Bestilling(menukort.get(pizzaNummer-1), currentOrderNr); // TODO: bestillingsnummer mgl.     
        //tilføj bestilling til ordreliste 
        aktiveOrdrer.add(bestilling);
        //vis ordrenummer på skærm
        ui.visOrdrenummer(currentOrderNr);
        //vis pizzavalg
        ui.visPizzaValg(bestilling.getPizza().toString());
        //tæl ordrenummer op
        currentOrderNr++;
       
            //gemIArkiv(bestilling);
            DBFacade db = new DBFacade();
            db.gemIDatabase(bestilling); 
    }

    public ArrayList<Bestilling> getAktiveOrdrer() {
        return aktiveOrdrer;
    }

    public void visMenukort() {
        ui.visMenukort(menukort);
    }

    public void fjernOrdre() {
        int ordrenummer = ui.fjernOrdre();
        Iterator<Bestilling> iter = aktiveOrdrer.iterator();
            while (iter.hasNext()) {
                if ( iter.next().getOrdreNummer()==ordrenummer)
                    iter.remove();
            }
    }
            
    private void visOrdrer() {
        ui.visOrdrer(aktiveOrdrer);
    }

     public void gemIArkiv (Bestilling b) throws IOException{
        File arkiv = new File("arkiv.txt");
        if (!arkiv.exists()) {
            System.out.println("opretter ny fil");
	    arkiv.createNewFile();
	  }
        try (BufferedWriter br = new BufferedWriter(new FileWriter(arkiv,true))){
            br.write(b.toString());
            br.newLine();
            br.flush();
            br.close();
        }
        
        catch (IOException e) {
        }   
    }   
}
