package wiring;

public class Magician implements Performer {
    public Magician() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println();
    }

    private MagicBox magicBox;
    public void setMagicBox(MagicBox magicBox) {
        this.magicBox = magicBox;
    }

    private String magicWords;

    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }
}
