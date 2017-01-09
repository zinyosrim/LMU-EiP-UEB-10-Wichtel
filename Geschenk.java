
/**
 * Created by ZY on 02.01.17.
 */
public class Geschenk {

    // Attribute
    protected String name;
    protected double schwierigkeit;

    // Konstruktor
    public Geschenk() {
        this.name = Zufall.geschenkartikel();
        this.schwierigkeit = Zufall.schwierigkeit(25); // maximale Schwierigkeit vom Geschenk ist 25
    }

    // Methoden

    // Getter

    /**
     * Getter für name
     * @return String name
     */
    public String getName(){
        return this.name;
    }

    /**
     * Getter für Schwierigkeit
     * @return  double  schwierigkeit
     */
    public double getSchwierigkeit(){
        return this.schwierigkeit;
    }
    // überschriebene Objekt Methoden
    /**
     * Object Methode toString() wird überschrieben, Geschenk-Name und Schwierigkeit wird ausgegeben
     * @return  String
     */
    @Override
    public String toString() {
        return this.name  + " ["+ (int)(this.schwierigkeit*100)/100. + "] ";
    }


}
