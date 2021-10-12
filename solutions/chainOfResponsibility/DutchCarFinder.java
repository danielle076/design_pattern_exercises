package solutions.chainOfResponsibility;

public class DutchCarFinder implements CarFinder {
    private DutchCarDatabase database = new DutchCarDatabase();
    private CarFinder nextHandler;

    @Override
    public void setNext(CarFinder finder) {
        this.nextHandler = finder;
    }

    @Override
    public Car find(String licensePlate) {
        System.out.println("Trying to find car in the Dutch database...");

        for (Car car : database.getCars()) {
            if (car.licensePlate.equals(licensePlate)) {
                return car;
            }
        }

        if (nextHandler != null) {
            return nextHandler.find(licensePlate);
        } else {
            return null;
        }
    }
}
