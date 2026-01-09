public class Hund extends Tier {
    // Eigenschaften / Attribute
    private String rasse;

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

    //public Hund(String farbe, String rasse, String name) {
    //    this.farbe = farbe;
    //    this.rasse = rasse;
    //    this.name = name;
    //    this.anzahlBeine = 4;
    //}

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
    @Override
    public void gibLaut() {
        System.out.println("Wuff Wuff");
    }


    void apportiere(String teil) {
        System.out.println("Hund bringt " + teil + " zurück");
    }

    void beschreibeDichSelbst(){
        super.beschreibeDichSelbst();

        System.out.print("Welche Rasse ist unser Hund?");
        System.out.println(this.rasse);

    }
}
