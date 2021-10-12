package solutions.chainOfResponsibility;

public class Car {
    public String brand;
    public String model;
    public String licensePlate;

    public Car(String brand, String model, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return String.format("Brand: %s, model: %s, licensePlate: %s", brand, model, licensePlate);
    }
}
