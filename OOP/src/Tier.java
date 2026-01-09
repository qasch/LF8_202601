public abstract class Tier {
    protected int anzahlBeine;
    protected String name;
    protected String farbe;
    protected String art;

    // Konstruktoren
    public Tier() {

    }

    public Tier(int anzahlBeine, String name, String farbe, String art){
        this.anzahlBeine = anzahlBeine;
        this.name = name;
        this.farbe = farbe;
        this.art = art;
    }

    // abstrakte Methode
    public abstract void gibLaut();


    void beschreibeDichSelbst(){
        System.out.println();
        System.out.println("------- " + this.name + " -------");

        System.out.print("Wie viele Beine hat unser Tier? ");
        System.out.println(this.anzahlBeine);

        System.out.print("Welche Art ist unser Tier? ");
        System.out.println(this.art);

        System.out.print("Welche Farbe hat unser Tier? ");
        System.out.println(this.farbe);
    }
}
