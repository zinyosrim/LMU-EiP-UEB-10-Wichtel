

/**
 * Created by ZY on 02.01.17.
 */
public abstract class Wichtel implements Comparable<Wichtel> {

    // Attribute

    protected final String NAME;
    protected int gearbeiteteZeit;
    protected int anzahlgefertigterGeschenke;
    protected int dauer;
    protected Wichtel andererWichtel;

    // Konstruktoren

    public Wichtel(){
        this.NAME = Zufall.koboldname();
    }

    public Wichtel(Wichtel w) {           // überladener Konstruktor
        NAME = Zufall.koboldname();
    }

    // Methoden

    /**
     * Getter für dauer
     * @return dauer
     */
    protected int getDauer() {
        return this.dauer;
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
        this.dauer = this.dauer - 1;
    }

    public double effizienz() {
        if (this.gearbeiteteZeit > 0)
        return this.anzahlgefertigterGeschenke/this.gearbeiteteZeit;
        else return 1000;
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

