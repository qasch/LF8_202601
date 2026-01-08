public class Main {
    static void main(String[] args) {
        Hund gretl = new Hund(4, "schwarz", "Labrador", "Grelt");

        gretl.beschreibeDichSelbst();
        gretl.belle();
        gretl.apportiere("Ball");

        // ------------------

        Hund fiffi = new Hund(3, "braun", "Pinscher", "Fiffi");

        fiffi.beschreibeDichSelbst();
        fiffi.belle();
        fiffi.apportiere("Stock");

        Hund bello = new Hund();
        bello.beschreibeDichSelbst();

    }
}
