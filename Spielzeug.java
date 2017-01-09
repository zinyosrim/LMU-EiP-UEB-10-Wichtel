

/**
 * Created by ZY on 02.01.17.
 */
public class Spielzeug extends Geschenk {

    // Attribute
    private double spannung;
    private int MAX_SCHWIERIGKEIT = 10;

    // Konstruktor
    public Spielzeug(){
        super();
        this.name = Zufall.spielzeug();
        this.schwierigkeit = Zufall.schwierigkeit(this.MAX_SCHWIERIGKEIT);
        this.spannung = this.schwierigkeit * this.name.length() / 10;
    }

    // Methoden

    /**
     * Überschriebene Objekt Methode toString()
     * @return String
     */
    @Override
    public String toString() {

        return this.name  + " ["+ Math.round(this.schwierigkeit*100.)/100. + "] "+ "(Spannung: " + Math.round(this.spannung*10.)/10. +")";
    }

}
