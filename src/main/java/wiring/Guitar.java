package wiring;

import annotations.StringedInstrument;
import org.springframework.stereotype.Component;

@StringedInstrument
@Component
public class Guitar implements Instrument {
    public Guitar() {
    }

    @Override
    public void play() {

    }
}
