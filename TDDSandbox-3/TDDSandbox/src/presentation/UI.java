//@ Cathrine, Cassandra, Kristine og Sofia
package presentation;

import businesslogic.Bestilling;
import businesslogic.Pizza;
import java.util.ArrayList;

public interface UI {
    
    public void visHovedmenu();
    
    public int vælgPizza();

    public void visPizzaValg(String string);

    public void visOrdrenummer(int ordrenummer);

    public void visMenukort(ArrayList<Pizza> menukort);
    
    public void visOrdrer(ArrayList<Bestilling> aktiveOrdrer);

    public String hovedMenuValg();

    public int fjernOrdre();
}
