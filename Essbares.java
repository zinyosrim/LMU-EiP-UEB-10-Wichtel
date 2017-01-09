

/**
 * Created by ZY on 02.01.17.
 */
public class Essbares extends Geschenk {

    // Attribute
    private boolean gesund = false;
    private int MAX_SCHWIERIGKEIT = 15;

    // Konstruktor
    public Essbares(){
        super();
        this.name = Zufall.essbares();
        this.schwierigkeit = Zufall.schwierigkeit(this.MAX_SCHWIERIGKEIT);
        if ((int)this.schwierigkeit%2 == 0) this.gesund = true;
    }

    // Methoden

    /**
     * Überschriebene Objekt-Methode toString()
     * @return  String
     */
    public String toString() {

        return this.name  + " ["+ Math.round(this.schwierigkeit*100.)/100. + "] "+ "(" + (this.gesund==true?"Ziemlich gesund)":"nicht unbedingt gesund)");
    }

}
