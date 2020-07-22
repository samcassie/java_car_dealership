import Components.Chassis;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChassisTest {

    Chassis chassis;

    @Before
    public void before(){
        chassis = new Chassis("Vauxhall", "Speedo", 2500, "red", 4, 5);
    }

    @Test
    public void getVariables(){
        assertEquals("Vauxhall", chassis.getMake());
        assertEquals("Speedo", chassis.getModel());
        assertEquals(2500, chassis.getPrice());
        assertEquals("red", chassis.getColour());
        assertEquals(4, chassis.getTyreSlots());
        assertEquals(5, chassis.getNumOfDoors());
    }
}
