package wiring;

public abstract class Instrumentalist implements Performer {

    private String song;
    private Instrument instrument;

    @Override
    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }



    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String screamSong() {
        return song;
        
    }

    public abstract Instrument getInstrument();

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
