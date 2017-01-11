

/**
 * Created by ZY on 02.01.17.
 */
public abstract class Wichtel implements Comparable<Wichtel> {

    // Attribute

    protected final String NAME;
    protected int gearbeiteteZeit;
    protected int anzahlgefertigterGeschenke;
    protected int dauer;


    // Konstruktoren

    public Wichtel(){
        this.NAME = Zufall.koboldname();
        this.anzahlgefertigterGeschenke = 0;
        this.gearbeiteteZeit=0;
    }

    public Wichtel(Wichtel w) {           // überladener Konstruktor
        this.NAME                       = w.getName();
        this.anzahlgefertigterGeschenke = w.getAnzahlgefertigterGeschenke();
        this.gearbeiteteZeit            = w.getGearbeiteteZeit();

    }

    // Methoden

    /**
     * Getter für dauer
     * @return dauer
     */
    protected int getDauer() {
        return this.dauer;
    }
    public void getEffizienz(){
        System.out.print(" Anzahl:"+this.anzahlgefertigterGeschenke+" Zeit:"+this.gearbeiteteZeit);
        //return this.anzahlgefertigterGeschenke/this.gearbeiteteZeit;
    }

    /**
     * Getter für NAME
     * @return NAME
     */
    protected String getName() {
        return this.NAME;
    }

    /**
     * Getter für gearbeiteteZeit
     * @return gearbeiteteZeit
     */
    public int getGearbeiteteZeit() {
        return gearbeiteteZeit;
    }

    /**
     * Getter für anzahlgefertigterGeschenke
     * @return anzahlgefertigterGeschenke
     */
    public int getAnzahlgefertigterGeschenke() {
        return anzahlgefertigterGeschenke;
    }

    // weitere Methoden

    public boolean arbeitetNoch() {
        return (this.dauer > 0);
    }

    public void arbeiteWeiter() {
        this.dauer--;
    }

    public double effizienz() {
        if (this.gearbeiteteZeit > 0) {
            return (double)this.anzahlgefertigterGeschenke / (double)this.gearbeiteteZeit;
        } else return 0;
    }

    // abstrakte Methoden

    /**
     * Jeder Wichtel hat eine Methode arbeite(Geschenk g), die dem Wichtel einen neuen Auftrag zuweist.
     * Dabei unterscheidet sich die Ausführung von Wichtelart zu Wichtelart.
     * @param g    Geschenk
     */
    abstract void arbeite(Geschenk g);

    // zu überschreibende Objektmethoden

    /**
     * Überschreiben der Objekt-Methode toString()
     * @return  String
     */
    @Override
    public String toString() {
        return NAME;
    }

    // Interface Implementierungen

    /**
     * In the foregoing description, the notation sgn(expression) designates the mathematical signum function,
     * which is defined to return one of -1, 0, or 1 according to whether the value of expression
     * is negative, zero or positive.
    *  @param andererWichtel
     * @return -1, 0, or 1 sofern die eigene Effizienz kleiner, gleich oder grösser ist.
     */
    public int compareTo(Wichtel andererWichtel){
        double delta = this.effizienz() - andererWichtel.effizienz();
        if (delta < 0) return -1;
        if (delta > 0) return 1;
        return 0;
    };

}

