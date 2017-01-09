

/**
 * Created by ZY on 02.01.17.
 */
public class Kleidung extends Geschenk {

    // Attribute
    private int eleganz;
    private int MAX_SCHWIERIGKEIT = 5;

    // Konstruktor
    public Kleidung(){
        this.name = Zufall.kleidung();
        this.schwierigkeit = Zufall.schwierigkeit(this.MAX_SCHWIERIGKEIT);
        this.eleganz = this.name.length();
    }

    // Methoden
    /**
     * Überschriebene Objekt-Methode toString()
     * @return  String
     */
    @Override
    public String toString() {

        return this.name  + " ["+ Math.round(this.schwierigkeit*100.)/100. + "] "+ "(Eleganz: "+this.eleganz+")";
    }



}
