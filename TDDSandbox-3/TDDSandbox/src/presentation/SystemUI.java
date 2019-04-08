//@ Cathrine, Cassandra, Kristine og Sofia
package presentation;

import businesslogic.Bestilling;
import businesslogic.Pizza;
import java.util.ArrayList;
import java.util.Scanner;

public class SystemUI implements UI{       
public ArrayList<String> output = new ArrayList<>();

    @Override
    public int vælgPizza() {
        System.out.print("Vælg pizzanr: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
        //System.out.print("Indtast afhentningstidspunkt + kundenavn: ");
        //return scanner.nextLine();
    }

    @Override
    public void visPizzaValg(String string) {
        System.out.println(string);
    }

    @Override
    public void visOrdrenummer(int ordrenummer) {
        System.out.println("Ordrenummer: "+ordrenummer);
    }

    @Override
    public void visMenukort(ArrayList<Pizza> menukort) {
        for(Pizza pizza : menukort) {
            System.out.println(pizza.toString());
        }
    }

    @Override
    public void visHovedmenu() {
        System.out.println("Vælg et af følgende punkter: ");
        System.out.println("1. Vis menukort");
        System.out.println("2. Opret bestilling");
        System.out.println("3. Se Ordrer");
        System.out.println("4. Slet ordrer fra bestilling");
        System.out.println("5. Afslut programmet");
    }

    @Override
    public String hovedMenuValg() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    @Override
    public int fjernOrdre() {
        System.out.println("Skriv hvilket ordrenummer du vil fjerne");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

@Override
    public void visOrdrer(ArrayList<Bestilling> aktiveOrdrer) {
        for(Bestilling b: aktiveOrdrer) {
            System.out.println(b.toString());
        }
    }
}
