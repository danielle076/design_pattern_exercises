package solutions.chainOfResponsibility;

public interface CarFinder {
    void setNext(CarFinder finder);

    Car find(String licensePlate);
}
