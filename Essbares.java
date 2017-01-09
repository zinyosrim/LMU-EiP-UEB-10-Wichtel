

/**
 * Created by ZY on 02.01.17.
 */
public class Essbares extends Geschenk {

    // Attribute
    private boolean gesund = false;


    // Konstruktor
    public Essbares(){
        super();
        this.name = Zufall.essbares();
        this.schwierigkeit = Zufall.schwierigkeit(15); // maximale Schwierigkeit vom Spielzeug ist 15
        if ((int)this.schwierigkeit%2 == 0) this.gesund = true;
    }

    // Methoden

    /**
     * Überschriebene Objekt-Methode toString()
     * @return  String
     */
    public String toString() {

        return this.name  + " ["+ (int)(this.schwierigkeit*100)/100. + "] "+ "(" + (this.gesund?"Ziemlich gesund)":"nicht unbedingt gesund)");
    }

}
