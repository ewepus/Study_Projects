package Demo_work_8;

public class Car {
    private String make;
    private String model;
    private int horsePower;

    public Car(String make) {
        this.make = make;
        this.model = "unknown";
        this.horsePower = -1;
    }

    public Car(String make, String model, int horsePower) {
        this(make);
        this.model = model;
        this.horsePower = horsePower;
    }

    public String getInfo() {
        return String.format(
                "The car is: %s %s - %d HP",
                make, model, horsePower);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
