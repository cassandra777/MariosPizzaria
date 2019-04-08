//@ Cathrine, Cassandra, Kristine og Sofia

package main;

import businesslogic.Controller;
import businesslogic.Pizza; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import presentation.SystemUI;
import presentation.UI;

public class MariosPizzabar {
    public static void main(String[] args) {
      
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
            
            UI ui = new SystemUI();
            Controller ctrl = new Controller(ui, menukort);
            ctrl.start();
            
            
        
    }
}
