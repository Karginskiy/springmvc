package wiring;

import java.util.Collection;
import java.util.Map;

public class OneManBand implements Performer {

    private Map<String, Instrument> instruments;
    
    @Override
    public void perform() throws PerformanceException {
        for (String key : instruments.keySet()) {
            System.out.print(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }
}
