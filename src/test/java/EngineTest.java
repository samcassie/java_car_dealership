import Components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine("Honda", "V8", 2000, "Petrol");
    }

    @Test
    public void getVariables(){
        assertEquals("Honda", engine.getMake());
        assertEquals("V8", engine.getModel());
        assertEquals(2000, engine.getPrice());
        assertEquals("Petrol", engine.getType());
    }


}
