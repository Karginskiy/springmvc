package wiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sun.misc.Perf;

@Configuration
public class SpringIdolConfig {

    @Bean
    public Performer duke() {
        return new Juggler(15);
    }

    @Bean
    public Performer kenny() {
        Instrumentalist kenny = new Instrumentalist();
        kenny.setSong("Jingle Bells");
        return kenny;
    }

    @Bean
    private Poem sonnet29() {
        return new Sonnet29();
    }

    @Bean
    public Performer poeticDuke() {
        return new PoeticJuggler(sonnet29());
    }

}
