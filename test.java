
import java.io.*;
import java.util.*;

public class test {
    private static final int anzahlGeschenke = 1;
    private static final int anzahlWichtel = 1;

    // Die gesamte Wunschliste
    private static Geschenk[] geschenke;

    // derzeitig bearbeitetes Geschenk
    private static int geschenknummer = 0;

    // Alle arbeitenden Wichtel
    private static Wichtel[] wichtel;

    // Basiszeiteinheit der Wichtel
    private static int runde = 1;

    private static boolean sindAlleFertig() {
        if(geschenknummer < geschenke.length)
            return false;
        else
            for(int i = 0; i < wichtel.length; i++){
                if(wichtel[i].arbeitetNoch())
                    return false;
            }
        return true;
    }

    private static Geschenk naechstesGeschenk() {
        if (geschenknummer < geschenke.length)
            return geschenke[geschenknummer++];
        return null;
    }

    private static boolean arbeit() {
        System.out.println("----------------------------------------");
        System.out.println("Runde " + runde++);
        for(int i = 0; i < wichtel.length; i++){
            Wichtel w = wichtel[i];
            if(w.arbeitetNoch())
                w.arbeiteWeiter();
            else {
                int gNr = geschenknummer;
                Geschenk g = naechstesGeschenk();
                if(g != null) {
                    System.out.println(w + " bearbeitet nun #" + gNr + " \n --> " + g);
                    w.arbeite(g);

                }
            }
        }
        return !sindAlleFertig();
    }


    public static void main(String args[]){

        geschenke = WerkstattTools.generiereGeschenke(anzahlGeschenke);
        wichtel = WerkstattTools.generiereWichtel(anzahlWichtel);

//        for (int i=0; i<wichtel.length;i++){
//            System.out.println(wichtel[i]);
//        }
//        for (int i=0; i<geschenke.length;i++){
//            System.out.println(geschenke[i]);
//        }
        while(arbeit());
    }
}
