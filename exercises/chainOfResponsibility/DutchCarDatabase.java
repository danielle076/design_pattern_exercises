package exercises.chainOfResponsibility;

import java.util.List;

public class DutchCarDatabase {
    private List<Car> cars;

    public DutchCarDatabase() {
        cars = List.of(new Car("Fiat", "Panda", "DD-777-F"), new Car("Ford", "Fiesta", "DI-585-D"),
        new Car("Fiat", "Multipla", "EW-222-F"));
    }

    public List<Car> getCars() {
        return cars;
    }
}
