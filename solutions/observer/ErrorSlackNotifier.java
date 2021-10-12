package solutions.observer;

public class ErrorSlackNotifier implements ErrorObserver {

    @Override
    public void notify(Error error) {
        System.out.println("Error detected, sending Slack notification");
    }
}
