

/**
 * Created by ZY on 02.01.17.
 */
public class Kleidung extends Geschenk {

    // Attribute
    private int eleganz;

    // Konstruktor
    public Kleidung(){
        this.name = Zufall.kleidung();
        this.schwierigkeit = Zufall.schwierigkeit(5); // maximale Schwierigkeit vom Spielzeug ist 5
        this.eleganz = this.name.length();
    }

    // Methoden
    /**
     * Überschriebene Objekt-Methode toString()
     * @return  String
     */
    @Override
    public String toString() {
        return this.name  + " ["+ (int)(this.schwierigkeit*100)/100. + "] "+ "(Eleganz: "+this.eleganz+")";
    }



}
