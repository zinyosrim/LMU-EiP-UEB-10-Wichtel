

/**
 * Erstellt einen roten Wichtel
 * Created by ZY on 02.01.17.
 */
public class RoterWichtel extends Wichtel {

    // Konstruktor
    public RoterWichtel() {
        super();
    }

    public RoterWichtel(Wichtel w) {
        super(w);
    }

    // Methoden

    /**
     * Object Methode toString() wird überschrieben, Farbe des Wichtels wird mit ausgegeben
     *
     * @return
     */

    @Override
    public String toString() {

        return "Roter Wichtel  " + this.NAME;
    }

    /**
     * Zuweisung von Auftrag an Wichtel. Beim Aufruf wird die Dauer entsprechend initialisiert.
     * Rote Wichtel arbeiten generell sehr schnell und brauchen für alles zwei Zeiteinheiten weniger,
     * außer bei Spielzeug - da arbeiten sie dann so schnell wie alle anderen.
     *
     * @param g Geschenk
     */
    public void arbeite(Geschenk g) {
        this.dauer = (int) g.getSchwierigkeit();
        if (!(g instanceof Spielzeug)) this.dauer = this.dauer - 2;
        this.gearbeiteteZeit += dauer;
        this.anzahlgefertigterGeschenke++;
    }

    // Interface Implemetierungen


    @Override
    public int compareTo(Wichtel andererWichtel) {
        if (this.effizienz() > andererWichtel.effizienz()) {
            return 1;
        } else if (this.effizienz() < andererWichtel.effizienz()) {
            return -1;
        } else {
            return 0;
        }
    }
}
