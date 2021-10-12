package exercises.chainOfResponsibility;

import java.util.List;

public class FrenchCarDatabase {
    private List<Car> cars;

    public FrenchCarDatabase() {
        cars = List.of(new Car("Renault", "Megane", "AB-123-A"), new Car("Peugeot", "208", "AB-321-D"),
        new Car("Peugeot", "308", "DD-133-F"));
    }

    public List<Car> getCars() {
        return cars;
    }
}
