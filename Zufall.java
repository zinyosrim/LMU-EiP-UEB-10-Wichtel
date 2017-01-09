

import java.util.*;
									
public class Zufall {				
    private static Random rand = new Random();
	private static final String[] lexicon = {"ARI","BOR","CAR","DUR","EORL","FRI","GEROS","HATI","IOTI","JOLA","KO","LE","MU","NOR","OPO","ROMI","SETI","TAZ","UMA","VAR","WEL","XUL","YIFI","ZOTO"};

    private static String[] geschenke = {"Spannendes Buch", "Robuster Nussknacker", "Schnelles Auto", "Stacheliger Kaktus", "Duftende Badesalze", "Leckerer Essensgutschein"};

	private static String[] essbares = {"Schoko-Nikolaus", "Knusprige Kekse", "Aromatischer Tee", "Selbstgemachtes Pesto", "Leckere Papaya", "Saftige Kekse"};
			
    private static String[] kleidung = {"Kuscheliger Schal", "Rote Unterbuxe", "Thermo-Ski-Unterwaesche", "Warme Socken", "Lange Struempfe", "Dicker Pullover", "Zipfelige Muetze", "Bequeme Hose"};

    private static String[] spielzeug = {"Niedliche Puppe", "Interessantes Brettspiel", "Schnelles Auto", "Grosser Bagger", "Schnelles Kartenspiel", "Rasende Eisenbahn", "Gemaltes Memory"};

    /**
     * Gibt einen zufaelligen Geschenkartikel zurueck.
     * 
     * @return Der Name des Geschenks.
     */
    public static String geschenkartikel() {
        return geschenke[rand.nextInt(geschenke.length)];
    }

    /**
     * Gibt eine zufaellige Zahl zwischen {@code 0} und {@code i - 1/100} zurueck.
     * 
     * @param i Die Obergrenze (nicht eingeschlossen).
     * @return Die Zufallszahl.
     */
    public static double schwierigkeit(final int max) {
        return ((double) rand.nextInt(max * 100)) / 100;
    }

    /**
     * Gibt ein zufaelliges Kleidungsstueck zurueck.
     * 
     * @return Der Name des Kleidungsstuecks.
     */
    public static String kleidung() {
        return kleidung[rand.nextInt(kleidung.length)];
    }
	
	/**
     * Gibt etwas zufaelliges Essbares zurueck.
     * @return Der Name der Speise.
     */
    public static String essbares() {
        return essbares[rand.nextInt(essbares.length)];
    }

    /**
     * Gibt einen zufaelligen Vornamen zurueck, der bei Wichteln beliebt ist. 
     * @return Der Name.
     */
	public static String koboldname(){
		StringBuilder builder = new StringBuilder();
		while(builder.toString().length() == 0) {
			int length = rand.nextInt(2)+2;
			for(int i = 0; i < length; i++) {
				builder.append(lexicon[rand.nextInt(lexicon.length)]);
			}
		}
		return builder.toString();
	}

    /**
     * Gibt ein zufaelliges Spielzeug zurueck.
     * 
     * @return Der Name des Spielzeugs.
     */
    public static String spielzeug() {
        return spielzeug[rand.nextInt(spielzeug.length)];
    }

    /**
     * Gibt eine zufaellige Zahl zwischen {@code 0} und {@code i - 1} zurueck.
     * 
     * @param i Die Obergrenze (nicht eingeschlossen).
     * @return Die Zufallszahl.
     */
    public static int zahl(final int max) {
		if(max == 0)
			return 0;
        return rand.nextInt(max);
    }
	
}