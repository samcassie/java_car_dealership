package VehicleTypes;

public abstract class Vehicle {

    private String name;
    private int damageCost;

    public Vehicle(String name) {
        this.name = name;
        this.damageCost = 0;
    }

    public String getName() {
        return name;
    }

    public int getDamageCost() {
        return damageCost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamageCost(int damageCost) {
        this.damageCost = damageCost;
    }
}
