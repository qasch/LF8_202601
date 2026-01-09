public class Schildkroete extends Tier{
    boolean hatPanzer;

    public Schildkroete(int anzahlBeine, String name, String farbe, String art) {
       super(anzahlBeine,name,farbe,art);
       this.hatPanzer = true;
    }

    @Override
    public void gibLaut(){
        System.out.println("höhöhö");
    }

    @Override
    void beschreibeDichSelbst(){
        super.beschreibeDichSelbst();
        System.out.println("Hat unsere Schildkroete einen Panzer? " + this.hatPanzer);
    }
}
