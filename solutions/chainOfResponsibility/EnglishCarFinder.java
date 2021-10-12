package solutions.chainOfResponsibility;

public class EnglishCarFinder implements CarFinder {
    private EnglishCarDatabase database = new EnglishCarDatabase();
    private CarFinder nextHandler;

    @Override
    public void setNext(CarFinder finder) {
        this.nextHandler = finder;
    }

    @Override
    public Car find(String licensePlate) {
        System.out.println("Trying to find car in the English database...");

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
