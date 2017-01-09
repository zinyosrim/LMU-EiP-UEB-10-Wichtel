

import java.io.*;

public class Werkstatt {
	
	private final int anzahlGeschenke = 500;
	private final int anzahlWichtel = 25;
	
	// Die gesamte Wunschliste
	private Geschenk[] geschenke;
	
	// derzeitig bearbeitetes Geschenk
	private int geschenknummer = 0;
	
	// Alle arbeitenden Wichtel
	private Wichtel[] wichtel;
	
	// Basiszeiteinheit der Wichtel
	private int runde = 1;
	
	
	public Werkstatt(){
		
		// Wir leiten die ganze Ausgabe in eine Datei um.
		try{
			System.setOut(new PrintStream(new FileOutputStream("Werkstattlog.txt")));
		}
		catch (Exception e) {System.out.println(e);}

		geschenke = WerkstattTools.generiereGeschenke(anzahlGeschenke);
		wichtel = WerkstattTools.generiereWichtel(anzahlWichtel);
	}
	
	private Geschenk naechstesGeschenk(){
		if(geschenknummer < geschenke.length)
			return geschenke[geschenknummer++];
		return null;
	}

	private boolean sindAlleFertig() {
		if(geschenknummer < geschenke.length)
			return false;
		else
			for(int i = 0; i < wichtel.length; i++){
				if(wichtel[i].arbeitetNoch())
					return false;
			}
		return true;
	}
	
	private boolean arbeit() {
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
	
	private void zeigeLeistungen() {
		System.out.println("----------------------------------------");
		System.out.println("Leistungsindex: ");
		for(int i = wichtel.length - 1; i >= 0; i--) {
			if(i == wichtel.length - 4)
				System.out.println("----------------------------------------");
			Wichtel w = wichtel[i];
			System.out.println(wichtel.length - i + ". Platz: " + w + " mit einer Effizienz von " + w.effizienz() + " Geschenke pro Runde.");
		}
	}

	/**
	 * Selection sort nach:
	 * https://www.cs.cmu.edu/~adamchik/15-121/lectures/Sorting%20Algorithms/sorting.html
	 */
	private void sortiere(){
		Wichtel tmpWichtel; //temporäres Wichtel zum Vertauschen
		for ( int i = 0; i < wichtel.length-1; i++ ){
			for ( int j = i+1; j < wichtel.length; j++ ){
				// wenn das andere Wichtel "größer" ist ...
				if (wichtel[i].compareTo(wichtel[j]) > 0 ){
					// vertausche die beiden Wichtel im Array
					tmpWichtel	= wichtel[i];
					wichtel[i] 	= wichtel[j];
					wichtel[j] 	= tmpWichtel;
				}
			}
		}

	}

    private Wichtel getHighPerformerIndex (String color){
        int index=0;
	    switch (color) {
            case "rot": for (int i=0; wichtel[i] instanceof RoterWichtel; i++ ) index = i;
                        return wichtel[index];
            case "blau": for (int i=0; wichtel[i] instanceof BlauerWichtel; i++ ) index = i;
                        return wichtel[index];
            case "gelb": for (int i=0; wichtel[i] instanceof GelberWichtel; i++ ) index = i;
                        return wichtel[index];
            }
    }

	
	// Eine Werkstatt wird angelegt, dann werden alle Geschenke bearbeitet, 
	// bis die Liste durch ist. Dann sortieren wir die Wichtel nach Effizienz
	// und geben sie entsprechend aus.
	// Momentan auskommentiert, sollte am Schluss alles kompilieren und dem Logfile gleichen.
	// Erstellen Sie bis dahin eigenen Testaufrufe von Methoden.
	public static void main(String[] args) {
		Werkstatt werkstatt = new Werkstatt();

		while(werkstatt.arbeit());
		werkstatt.sortiere();
		werkstatt.zeigeLeistungen();
		
		// TODO e): Klonen der drei besten Wichtel

        Wichtel roterSuperWichtel  = new RoterWichtel;
        roterSuperWichtel = wichtel[getHighPerformerIndex("rot")];
        Wichtel blauerSuperWichtel = wichtel[getHighPerformerIndex("blau")];
        Wichtel gelberSuperWichtel = wichtel[getHighPerformerIndex("gelb")];

        System.out.print(roterSuperWichtel.toString()+" "+roterSuperWichtel.getName()+" "+gelberSuperWichtel.getName());
	}
	
}