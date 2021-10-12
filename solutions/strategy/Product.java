package solutions.strategy;

public class Product {
    public int id;
    public String name;
    public double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("ID: %s, name: %s, price: %.2f\n", this.id, this.name, this.price);
    }
}
