import VehicleTypes.ISell;
import VehicleTypes.Vehicle;

import java.util.ArrayList;

public class Customer{

    private int money;
    private ArrayList<ISell> ownedVehicles;

    public Customer(int money) {
        this.money = money;
        this.ownedVehicles = new ArrayList<ISell>();
    }

    public int getMoney() {
        return money;
    }

    public void addToMoney(int amount){
        money += amount;
    }

    public void addVehicle(ISell vehicle){
        this.ownedVehicles.add(vehicle);
    }

    public ArrayList<ISell> getOwnedVehicles() {
        return ownedVehicles;
    }

    public void buy(ISell vehicle, Dealership dealership){
        if (vehicle.totalPrice() < this.money) {
            dealership.getSellableVehicles().remove(vehicle);
            this.ownedVehicles.add(vehicle);
            this.money -= vehicle.totalPrice();
            dealership.addToTill(vehicle.totalPrice());
        }
    }
}
