

/**
 * Created by ZY on 02.01.17.
 */
public class Spielzeug extends Geschenk {

    // Attribute
    private double spannung;

    // Konstruktor
    public Spielzeug(){
        super();
        this.name = Zufall.spielzeug();
        this.schwierigkeit = Zufall.schwierigkeit(10); // maximale Schwierigkeit vom Spielzeug ist 10
        this.spannung = this.schwierigkeit * this.name.length() / 10;
    }

    // Methoden

    /**
     * Überschriebene Objekt Methode toString()
     * @return String
     */
    @Override
    public String toString() {
        return this.name  + " ["+ (int)(this.schwierigkeit*100)/100. + "] "+ "(Spannung: " + (int)(this.spannung*10)/10. +")";
    }

}
