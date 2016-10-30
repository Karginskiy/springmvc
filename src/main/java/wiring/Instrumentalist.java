package wiring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import javax.inject.Inject;
import javax.inject.Named;

public abstract class Instrumentalist implements Performer {

    @Value("#{systemProperties.myFavoriteSong}")
    private String song;

    @Named("guitar")
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

    @Qualifier(value = "guitar")
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
