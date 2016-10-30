package wiring;

import annotations.Strummed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public abstract class Instrumentalist implements Performer {

    private String song;
    @Autowired
    @Qualifier("guitar")
    @Strummed
    private Instrument instrument;

    public Instrumentalist() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }

    public Instrumentalist(Instrument instrument) {
        this.instrument = instrument;
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

    @Autowired
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
