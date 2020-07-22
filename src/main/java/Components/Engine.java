package Components;

public class Engine extends Component {

    private String type;

    public Engine(String make, String model, int price, String type) {
        super(make, model, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
