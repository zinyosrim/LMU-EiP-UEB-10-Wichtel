

/**
 * Created by ZY on 02.01.17.
 */
public abstract class Wichtel implements Comparable<Wichtel> {

    // Attribute

    protected final String NAME;
    protected int gearbeiteteZeit = 0;
    protected int anzahlgefertigterGeschenke = 0;
    protected int dauer;


    // Konstruktoren

    public Wichtel(){
        this.NAME = Zufall.koboldname();
        this.anzahlgefertigterGeschenke = 0;
        this.gearbeiteteZeit=0;
    }

    public Wichtel(Wichtel w) {           // überladener Konstruktor
        NAME = w.getName();

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
    // weitere Methoden

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
    public abstract int compareTo(Wichtel andererWichtel);

}

