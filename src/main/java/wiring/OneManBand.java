package wiring;

import java.util.Collection;
import java.util.Map;
import java.util.Properties;

public class OneManBand implements Performer {

    private Properties instruments;
    
    @Override
    public void perform() throws PerformanceException {
        for (Object key : instruments.keySet()) {
            System.out.print(key + " : ");
            Instrument instrument = (Instrument) instruments.get(key);
            instrument.play();
        }
    }

    public void setInstruments(Properties instruments) {
        this.instruments = instruments;
    }
}
