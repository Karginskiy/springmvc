import aspects.Volunteer;
import org.junit.Test;
import aspects.Magician;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class MagicianTest {

    @Test
    public void magicianShouldReadVolunteersMind() {

        Magician magician = mock(Magician.class);
        Volunteer volunteer = mock(Volunteer.class);
        volunteer.thinkOfSomething("Queen of Hearts");

        assertEquals("Queen of Hearts", magician.getThoughts());

    }

}
