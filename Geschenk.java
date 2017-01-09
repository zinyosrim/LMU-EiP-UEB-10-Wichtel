

/**
 * Created by ZY on 02.01.17.
 */
public class Geschenk {

    // Attribute
    protected String name;
    protected double schwierigkeit;
    private final int MAX_SCHWIERIGKEIT = 25;
    protected final int MIN_SCHWIERIGKEIT = 0;

    // Konstruktor
    public Geschenk() {
        this.name = Zufall.geschenkartikel();
        this.schwierigkeit = Zufall.schwierigkeit(this.MAX_SCHWIERIGKEIT);
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
     * Getter für schwierigkeit
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
        return this.name  + " ["+ Math.round(this.schwierigkeit*100.)/100. + "] ";
    }


}
