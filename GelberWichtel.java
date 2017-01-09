

/**
 * Erstellt einen gelben Wichtel
 * Created by ZY on 02.01.17.
 */
public class GelberWichtel extends Wichtel {

    // Konstruktor
    public GelberWichtel(){
        super();
    }

    // Methoden

    /**
     * Object Methode toString() wird überschrieben, Farbe des Wichtels wird mit ausgegeben.
     *
     * @return
     */

    @Override
    public String toString() {

        //return "Wichtel-Name = " + NAME  + ", Farbe = Gelb";
        return "Gelber Wichtel " + this.NAME;
    }

    /**
     * Zuweisung von Auftrag an Wichtel. Beim Aufruf wird die Dauer entsprechend initialisiert.
     * Gelbe Wichtel sind sehr kü̈nstlerisch und modeorientiert.
     * Sie brauchen 2 Zeiteinheiten länger für alle Kleidung und eine Zeiteinheit länger für alles andere.
     * @param g    Geschenk
     */
    public void arbeite(Geschenk g) {
        this.dauer = (int) g.getSchwierigkeit();
        if (g instanceof Kleidung) this.dauer += 2;
        else this.dauer += 1;
        this.gearbeiteteZeit += this.dauer;
        this.anzahlgefertigterGeschenke++;
    }


    // Interface Implemetierungen

    @Override public int compareTo(Wichtel andererWichtel) {
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
