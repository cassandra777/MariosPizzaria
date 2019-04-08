//@ Cathrine, Cassandra, Kristine og Sofia
package businesslogic;

public class Bestilling {
    private Pizza pizza;
    private int ordreNummer;

    public Bestilling(Pizza pizza, int ordreNummer) {
        this.pizza = pizza;
        this.ordreNummer=ordreNummer;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public int getOrdreNummer() {
        return ordreNummer;
    }

    @Override
    public String toString() {
        return "Ordre Nr: \t\t   " + ordreNummer
                + "\nOrdre beskrivelse:\n\t1 x " + pizza.getPizzaNavn()
                + "\nPris: \t\t" + (int)pizza.getPris() + ",-";
    }
    
    
    
}
