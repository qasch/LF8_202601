public class Main {
    static void main(String[] args) {
        Hund gretl = new Hund(4, "schwarz", "Labrador", "Gretl");

        gretl.beschreibeDichSelbst();
        gretl.gibLaut();
        gretl.apportiere("Ball");

        System.out.println("Anzahl Beine Gretl: " + gretl.getAnzahlBeine());
        gretl.setAnzahlBeine(-6);
        System.out.println("Anzahl Beine Gretl: " + gretl.getAnzahlBeine());

        Schildkroete schildi = new Schildkroete(4, "Schildi", "grün", "Schildkröte");
        schildi.gibLaut();
        schildi.beschreibeDichSelbst();

        // ------------------

        //Hund fiffi = new Hund(300, "braun", "Pinscher", "Fiffi");

        //fiffi.beschreibeDichSelbst();
        //fiffi.belle();
        //fiffi.apportiere("Stock");

        //Hund bello = new Hund("grau", "Dackel", "Bello");
        //bello.beschreibeDichSelbst();
        //bello.belle("Wiff Wiff");

    }
}
