package Components;

public class Tyres extends Component {

    private int size;

    public Tyres(String make, String model, int price, int size) {
        super(make, model, price);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
