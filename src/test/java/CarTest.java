import Components.Chassis;
import Components.Engine;
import Components.Tyres;
import VehicleTypes.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Chassis chassis;
    Engine engine;
    Tyres tyres;
    Car car;

    @Before
    public void before(){
        chassis = new Chassis("Vauxhall", "Speedo", 2500, "red", 4, 5);
        engine = new Engine("Honda", "V8", 2000, "Petrol");
        tyres = new Tyres("Pirelli", "J2", 300, 20);
        car = new Car("SuperMobile", engine, tyres, chassis);
    }

    @Test
    public void hasVariables(){
        assertEquals("SuperMobile", car.getName());
        assertEquals(0, car.getDamageCost());
        assertEquals(tyres, car.getTyres());
        assertEquals(engine, car.getEngine());
        assertEquals(chassis, car.getChassis());
    }

    @Test
    public void CarHasType(){
        assertEquals("Petrol", car.getCarType());
    }

    @Test
    public void hasTotalPrice(){
        assertEquals(5700, car.totalPrice());
    }

    @Test
    public void canAddDamageCost(){
        car.setDamageCost(300);
        assertEquals(5400, car.totalPrice());
    }

}
