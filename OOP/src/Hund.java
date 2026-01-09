public class Hund {
    // Eigenschaften / Attribute
    private int anzahlBeine;
    private String farbe;
    private String rasse;
    private String name;

    // Standard - Konstruktor / Parameterloser Konstruktor
    public Hund() {

    }
    // Ein Konstruktor ist dafür da, ein neu erzeugtes Objekt in einen sinnvollen
    // Ausgangszustand zu versetzen
    public Hund(int anzahlBeine, String farbe, String rasse, String name) {
        // this is eine Referenz auf die Klasse an sich
        // wir geben damit an, dass wir dass z.B. Klassenattribut farbe meinen
        // und es so vom Parameter farbe unterscheiden
        this.setAnzahlBeine(anzahlBeine);
        this.farbe = farbe;
        this.rasse = rasse;
        this.name = name;
    }

    public Hund(String farbe, String rasse, String name) {
        this.anzahlBeine = 4;
        this.farbe = farbe;
        this.rasse = rasse;
        this.name = name;
    }

    // Getter und Setter


    // Getter
    public int getAnzahlBeine() {
        return this.anzahlBeine;
    }
    // Setter
    public void setAnzahlBeine(int anzahlBeine) {
        if (anzahlBeine <= 4 && anzahlBeine >= 0) {
            this.anzahlBeine = anzahlBeine;
        } else {
            this.anzahlBeine = 4;
        }
    }

    // Fähigkeiten / Methoden
    void belle() {
        System.out.println("Wuff Wuff");
    }

    void belle(String laut) {
        System.out.println(laut);
    }

    void apportiere(String teil) {
        System.out.println("Hund bringt " + teil + " zurück");
    }

    void beschreibeDichSelbst(){
        System.out.println();
        System.out.println("------- " + this.name + " -------");

        System.out.print("Wie viele Beine hat unser Tier? ");
        System.out.println(this.anzahlBeine);

        System.out.print("Welche Rasse ist unser Tier? ");
        System.out.println(this.rasse);

        System.out.print("Welche Farbe hat unser Tier?");
        System.out.println(this.farbe);
    }
}
