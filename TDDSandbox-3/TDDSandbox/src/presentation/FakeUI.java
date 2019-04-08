//@ Cathrine, Cassandra, Kristine og Sofia
package presentation;

import businesslogic.Bestilling;
import businesslogic.Pizza;
import java.util.ArrayList;

public class FakeUI implements UI {

    private String[] input;
    private int index = 0;
    public ArrayList<String> output = new ArrayList<>();

    public FakeUI(String[] input) {
        this.input = input;
    }

    @Override
    public int vælgPizza() {
        output.add("Skriv hvilket pizzanummer kunden har bestilt");
       return Integer.parseInt(input[index++]);
    }

    @Override
    public void visPizzaValg(String str) {
        output.add(str);    
    }

    @Override
    public void visOrdrenummer(int ordrenummer) {
        output.add(""+ordrenummer);
        
    }

    @Override
    public void visMenukort(ArrayList<Pizza> menukort) {
        for(Pizza pizza : menukort){ //først type og så navn man selv giver
            output.add(pizza.toString());
        }
    }

    @Override
    public void visHovedmenu() {
        output.add("Vælg et af følgende punkter: ");
        output.add("1. Vis menukort");
        output.add("2. Opret bestilling");
        output.add("3. Slet odrer fra bestilling");
        output.add("4. Afslut programmet");
                
    }

    @Override
    public String hovedMenuValg() {
        return input[index++];
    }

    @Override
    public int fjernOrdre() {
        output.add("Skriv hvilket ordrenummer du vil fjerne");
        return Integer.parseInt(input[index++]);
        
    }
    @Override
     public void visOrdrer(ArrayList<Bestilling> aktiveOrdrer) {
    }
}