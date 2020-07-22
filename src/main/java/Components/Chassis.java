package Components;

public class Chassis extends Component{

    private String colour;
    private int tyreSlots;
    private int numOfDoors;

    public Chassis(String make, String model, int price, String colour, int tyreSlots, int numOfDoors) {
        super(make, model, price);
        this.colour = colour;
        this.tyreSlots = tyreSlots;
        this.numOfDoors = numOfDoors;
    }

    public String getColour() {
        return colour;
    }

    public int getTyreSlots() {
        return tyreSlots;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setTyreSlots(int tyreSlots) {
        this.tyreSlots = tyreSlots;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }
}
