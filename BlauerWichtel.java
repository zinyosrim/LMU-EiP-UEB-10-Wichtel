

/**
 * Erstellt einen blauen Wichtel
 * Created by ZY on 02.01.17.
 */
public class BlauerWichtel extends Wichtel {

    // Konstruktor

    public BlauerWichtel(){
        super();
    }

    // Methoden

    // Überschriebene Objektmethoden

    /**
     * Object Methode toString() wird überschrieben, Farbe des Wichtels wird mit ausgegeben
     * @return
     */
    @Override
    public String toString() {
       // return "Wichtel-Name = " + NAME  + ", Farbe = Blau";
        return "Blauer Wichtel "+ this.NAME;
    }


    /**
     * Zuweisung von Auftrag an Wichtel. Beim Aufruf wird die Dauer entsprechend initialisiert.
     * Blaue Wichtel mögen gerne alles Essbare. Da sie einen Teil selber verspeisen, brauchen sie für diese
     * nur die Hälfte der Zeit. Bei allem anderen sind sie behä̈biger und brauchen 3 Zeiteinheiten länger.
     * @param g    Geschenk
     */
    public void arbeite(Geschenk g) {
        this.dauer = (int) g.getSchwierigkeit();
        if (g instanceof Essbares) this.dauer = this.dauer / 2;
        else this.dauer += 3;
    }

    // Interface Implemetierungen

    @Override
    public int compareTo(Wichtel andererWichtel) {
        if ( this.effizienz() > andererWichtel.effizienz() ) {
            return 1;
        }
        else if ( this.effizienz() < andererWichtel.effizienz() ){
            return -1;
        }
        else {
            return 0;
        }
    }

}
