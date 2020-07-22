import Components.Chassis;
import Components.Engine;
import Components.Tyres;
import VehicleTypes.Car;
import VehicleTypes.Motorbike;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Chassis chassis;
    Engine engine;
    Tyres tyres;
    Chassis chassis2;
    Engine engine2;
    Tyres tyres2;
    Car car;
    Motorbike motorbike;
    Dealership dealership;
    Customer customer;


    @Before
    public void before(){
        chassis = new Chassis("Vauxhall", "Speedo", 2500, "red", 4, 5);
        engine = new Engine("Honda", "V8", 2000, "Petrol");
        tyres = new Tyres("Pirelli", "J2", 300, 20);
        car = new Car("SuperMobile", engine, tyres, chassis);

        chassis2 = new Chassis("Vauxhall", "Speedo", 2500, "blue", 2, 0);
        engine2 = new Engine("Honda", "V8", 2000, "Petrol");
        tyres2 = new Tyres("Pirelli", "J2", 300, 20);
        motorbike = new Motorbike("SuperMobile", engine2, tyres2, chassis2);

        customer = new Customer(6000);
        customer.addVehicle(car);
        customer.addVehicle(motorbike);

        dealership = new Dealership(10000);
        dealership.addVehicle(car);
        dealership.addVehicle(motorbike);

    }

    @Test
    public void getVariables(){
        assertEquals(10000, dealership.getTill());
        assertEquals(2, dealership.getSellableVehicles().size());
    }

    @Test
    public void canBuyVehicle(){
        dealership.buy(car, customer);
        assertEquals(3, dealership.getSellableVehicles().size());
        assertEquals(4300, dealership.getTill());
    }

    @Test
    public void cantBuyTooMuch(){
        dealership.buy(car, customer);
        dealership.buy(motorbike, customer);
        assertEquals(3, dealership.getSellableVehicles().size());
        assertEquals(11700, customer.getMoney());
        assertEquals(1, customer.getOwnedVehicles().size());
    }

    @Test
    public void canRepairVehicle(){
        car.setDamageCost(300);
        dealership.repairVehicle(car);
        assertEquals(0, car.getDamageCost());
        assertEquals(9700, dealership.getTill());
        assertEquals(5700, car.totalPrice());
    }


}
