package solutions.observer;

public class ErrorLogger implements ErrorObserver {

    @Override
    public void notify(Error error) {
        System.out.printf("Logging error: [%s] %s\n", error.priority, error.message);
    }
}
