# Objektorientierte Programmierung in Java

>[!Note]
> Es kann durchaus sinnvoll sein, Teil B, also die Erstellung des Hauptprogramms schon während der Erstellung der Klasse umzusetzen. So kann der Code direkt getestet und nach und nach erweitert werden.

## Teil A – Erstellung der Klasse `Computer`

1. Erstelle eine Klasse `Computer`.

2. Die Klasse soll folgende Attribute besitzen:
   * Alle Attribute sollen `private` sein
   * `besitzer` (Text)
   * `speicherplatz` (Ganzzahl, in GB)
   * `seriennummer` (Ganzzahl)
     * darf nach der Initialisierung **nicht mehr verändert** werden können

3. Implementiere zwei Konstruktoren:

   * Konstruktor 1:
     * initialisiert `seriennummer` und `besitzer`
     * setzt den `speicherplatz` automatisch auf **256 GB**

   * Konstruktor 2:
     * initialisiert alle drei Attribute (`seriennummer`, `besitzer`, `speicherplatz`)

4. Implementiere folgende Methoden:

   * `speicherHinzufuegen(int gb)`
     * erhöht den vorhandenen Speicherplatz
     * negative oder ungültige Werte sollen abgefangen werden

   * `speicherEntfernen(int gb)`
     * reduziert den Speicherplatz
     * der Speicherplatz darf **nicht negativ** werden
     * bei einem Fehler soll eine verständliche Meldung ausgegeben werden

   * `zeigeDetails()`
     * gibt Seriennummer, Besitzer und aktuellen Speicherplatz auf der Konsole aus

5. Füge sinnvolle Getter und Setter für die Attribute hinzu wo sie **Sinn machen** und verwende sie in den Konstruktoren.

6. Ergänze sinnvolle Prüfungen:

   * Wenn der Besitzer `null` oder leer ist, soll ein Standardwert gesetzt oder eine Meldung ausgegeben werden
   * Wenn beim Konstruktor ein negativer Speicherplatz übergeben wird, soll ein sinnvoller Standardwert verwendet werden

7. Implementiere eine zusätzliche Methode `installiereProgramm` zu einer Programminstallation:

   * Die Methode erhält einen Programmnamen und den benötigten Speicherplatz
   * Das Programm kann nur installiert werden, wenn ausreichend Speicher vorhanden ist
   * Die Methode gibt zurück, ob die Installation erfolgreich war

8. Implementiere optional eine Methode zum Ändern des Besitzers:

   * Der neue Besitzername darf nicht leer sein

## Teil B – Erstellung Hauptprogramm

9. Erstelle eine Klasse `Main` als Hauptprogramm (mit einer `main`-Methode), in der du:

   * mindestens ein `Computer`-Objekt erzeugst
   * Speicherplatz hinzufügst und entfernst
   * die Detailausgabe mehrfach aufrufst
   * mindestens einen Fehlerfall bewusst testest

