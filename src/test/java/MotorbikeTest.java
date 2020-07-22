import Components.Chassis;
import Components.Engine;
import Components.Tyres;
import VehicleTypes.Car;
import VehicleTypes.Motorbike;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MotorbikeTest {

    Chassis chassis;
    Engine engine;
    Tyres tyres;
    Motorbike motorbike;

    @Before
    public void before(){
        chassis = new Chassis("Vauxhall", "Speedo", 2500, "blue", 2, 0);
        engine = new Engine("Honda", "V8", 2000, "Petrol");
        tyres = new Tyres("Pirelli", "J2", 300, 20);
        motorbike = new Motorbike("SuperMobile", engine, tyres, chassis);
    }

    @Test
    public void hasVariables(){
        assertEquals("SuperMobile", motorbike.getName());
        assertEquals(0, motorbike.getDamageCost());
        assertEquals(tyres, motorbike.getTyres());
        assertEquals(engine, motorbike.getEngine());
        assertEquals(chassis, motorbike.getChassis());
    }

    @Test
    public void CarHasType(){
        assertEquals("Petrol", motorbike.getMotorbikeType());
    }

    @Test
    public void hasTotalPrice(){
        assertEquals(5100, motorbike.totalPrice());
    }

    @Test
    public void canAddDamageCost(){
        motorbike.setDamageCost(300);
        assertEquals(4800, motorbike.totalPrice());
    }
}
