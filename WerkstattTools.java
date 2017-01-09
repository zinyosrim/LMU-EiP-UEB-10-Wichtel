
import java.util.Random;

/**
 * Created by ZY on 02.01.17.
 *
 */

public class WerkstattTools {

    /**
     * Erzeugt ein Array von Geschenken
     * @param anzahl der Geschenke
     * @return Geschenkarray der Größe anzahl
     */
    public static Geschenk[] generiereGeschenke(int anzahl) {
        Geschenk[] g = new Geschenk[anzahl];
        Random r = new Random();
        System.out.println("Es werden jetzt " + anzahl + " Geschenke erzeugt ....");
        for (int i = 0; i< anzahl; i++){
            switch (r.nextInt(4)) {
                case 0:
                    g[i] = new Geschenk();
                    break;
                case 1:
                    g[i] = new Essbares();
                    break;
                case 2:
                    g[i] = new Kleidung();
                    break;
                case 3:
                    g[i] = new Spielzeug();
            }
            System.out.println("Geschenk Nr. "+ i + ": " + g[i].toString()+ " ist zum Packen bereit.");
        }
        System.out.println("Es wurden " + anzahl + " Geschenke erzeugt.");
        System.out.println("----------------------------------------");
        return g;
    }

    /**
     * Erzeugt ein Array von Wichteln
     * @param anzahl der Wichtel
     * @return Wichtelarray der Größe anzahl
     */
    public static Wichtel[] generiereWichtel(int anzahl) {

        Wichtel[] w = new Wichtel[anzahl];
        Random r = new Random();
        System.out.println("Es werden jetzt " + anzahl + " Wichtel erzeugt ....");
        for (int i = 0; i < anzahl; i++) {
            switch (r.nextInt(3)) {
                case 0:
                    w[i] = new RoterWichtel();
                    System.out.println(w[i].toString()+ " meldet sich auf dem Panzerkreuzer Potemkin zum Appell!");
                    break;
                case 1:
                    w[i] = new BlauerWichtel();
                    System.out.println(w[i].toString()+ " meldet sich nüchtern zum Dienst!");
                    break;
                case 2:
                    w[i] = new GelberWichtel();
                    System.out.println(w[i].toString()+ " meldet sich ohne Gelbsucht aus dem Krankenhaus zurück!");
            }
        }
        System.out.println("Es wurden " + anzahl + " Wichtel erzeugt.");
        //System.out.println("--------------------------------------------------------------------------------");
        return w;
    }
}
