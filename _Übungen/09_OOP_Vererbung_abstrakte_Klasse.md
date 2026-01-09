# Vererbung und Abstrakte Klassen in Java

>[!NOTE]
> Für diese Übunng ist die Verwendung des Schlüsselworts `super` bzw. `super()` sehr hilfreich. Informiert euch ggf. eigenständig darüber.

1. Ändert die in der vorigen Übung erstellte Klasse `Computer` so ab, dass sie eine *abstrakte* Klasse ist.
2. Von ihr sollen die beiden *konkreten* Klassen `Laptop` und `Server` erben.
3. Die Klasse `Laptop` soll zusätlich das Attribut `akkustand` (Integer) haben.
4. Die Klasse `Server` soll zusätlich das Attribut `ipAdresse` (String) haben.
5. Erstellt den Konstruktor/die Konstruktoren in der Klasse `Computer` und ruft sie mittels `super()` in den andern Klassen auf.
6. Die Klasse `Computer` soll die abstrakte Klasse `gibGeraeteTypAus()` enthalten, welche in den konkreten Klassen überschrieben bzw. implementiert werden soll. in `Laptop` soll hier einfach der String "Laptop" und in `Server` der String "Server" ausgegeben werden.
7. Die Methode `zeigeDetails` soll vererbt werden, in den Unterklassen aber jeweils zusätzlich die Werte der Attribute `akkustand` bzw. `ipAdresse` ausgeben.

