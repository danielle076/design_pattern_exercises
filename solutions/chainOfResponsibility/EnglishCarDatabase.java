package solutions.chainOfResponsibility;

import java.util.List;

public class EnglishCarDatabase {
    private List<Car> cars;

    public EnglishCarDatabase() {
        cars = (List.of(new Car("Aston Martin", "Valkyrie", "BD342F"), new Car("Ford", "Fiesta", "BB554S"),
                new Car("Fiat", "Multipla", "SD242F")));
    }

    public List<Car> getCars() {
        return cars;
    }
}
