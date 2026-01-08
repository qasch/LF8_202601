public class Static {
    public static void main(String[] args) {
        //                       addiere(argument1, argument2)
        System.out.println(Static.addiere(3, 5));   // -> 3 + 5 = 8
        System.out.println(Static.addiere(2, 7));   // -> 2 + 7 = 9
        System.out.println(Static.addiere(312, 36));   // -> 312 + 36 = 348

        System.out.println(Static.dividiere(20.0f, 3.0f));
        System.out.println(Static.dividiere(2.0, 0));
    }

    // Methodendeklaration (Erstellen der Methode)
    //addiere(Parameterliste)
    static int addiere(int zahl1, int zahl2) {
        //int ergebnis = zahl1 + zahl2;
        //return ergebnis;

        //      3    +   5
        //      2    +   7
        return zahl1 + zahl2;
    }

    static double dividiere(double zahl1, double zahl2){
            return zahl1 / zahl2;
        }
    }


    // Casting (Umwandlung eines Datentyps in einen anderen)
    // - implizite Casting
    // - explizite Casting

    // Hund -> gretl : gretl.bellen();

    // Primitive Datentypen:
    // int
    // float
    // double
    // char
    // bool

    // Komplexen Datentypen:
    // String


// Arten von Fehlern:
// - Syntaxfehler
// - Logische Fehler
// - Laufzeit Fehler