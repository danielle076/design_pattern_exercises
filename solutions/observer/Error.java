package solutions.observer;

public class Error {
    public ErrorPriority priority;
    public String message;

    public Error(ErrorPriority priority, String message) {
        this.priority = priority;
        this.message = message;
    }
}
