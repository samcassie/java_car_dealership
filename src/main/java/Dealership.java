import VehicleTypes.ISell;
import VehicleTypes.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private int till;
    private ArrayList<ISell> sellableVehicles;

    public Dealership(int till) {
        this.till = till;
        this.sellableVehicles = new ArrayList<ISell>();
    }

    public int getTill() {
        return till;
    }

    public void addToTill(int amount){
        till += amount;
    }

    public ArrayList<ISell> getSellableVehicles() {
        return sellableVehicles;
    }

    public void addVehicle(ISell vehicle){
        this.sellableVehicles.add(vehicle);
    }

    public void buy(ISell vehicle, Customer customer){
        if (vehicle.totalPrice() < this.till) {
            customer.getOwnedVehicles().remove(vehicle);
            this.sellableVehicles.add(vehicle);
            this.till -= vehicle.totalPrice();
            customer.addToMoney(vehicle.totalPrice());
        }
    }

    public void repairVehicle(Vehicle vehicle){
        if (vehicle.getDamageCost() < this.till) {
            this.till -= vehicle.getDamageCost();
            vehicle.setDamageCost(0);
        }
    }


}
