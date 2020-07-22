package VehicleTypes;

import Components.Chassis;
import Components.Engine;
import Components.Tyres;

public class Car extends Vehicle implements ISell{

    private Engine engine;
    private Tyres tyres;
    private Chassis chassis;

    public Car(String name, Engine engine, Tyres tyres, Chassis chassis) {
        super(name);
        this.engine = engine;
        this.tyres = tyres;
        this.chassis = chassis;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public String getCarType(){
        return getEngine().getType();
    }

    public int totalPrice(){
        int total = 0;
        int EnginePrice = engine.getPrice();
        int ChassisPrice = chassis.getPrice();
        int TyresPrice = tyres.getPrice() * chassis.getTyreSlots();
        total = total + EnginePrice + ChassisPrice + TyresPrice;
        return total - getDamageCost();
    }
}
