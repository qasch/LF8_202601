public class Hund {
    // Eigenschaften / Attribute
    int anzahlBeine;
    String farbe;
    String rasse;
    String name;

    // Standard - Konstruktor / Parameterloser Konstruktor
    public Hund() {

    }

    public Hund(int anzahlBeine, String farbe, String rasse, String name) {
        this.anzahlBeine = anzahlBeine;
        this.farbe = farbe;
        this.rasse = rasse;
        this.name = name;
    }

    // Fähigkeiten / Methoden
    void belle() {
        System.out.println("Wuff Wuff");
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
