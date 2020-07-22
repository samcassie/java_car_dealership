import Components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres("Pirelli", "J2", 300, 20);
    }

    @Test
    public void getVariables(){
        assertEquals("Pirelli", tyres.getMake());
        assertEquals("J2", tyres.getModel());
        assertEquals(300, tyres.getPrice());
        assertEquals(20, tyres.getSize());
    }
}
