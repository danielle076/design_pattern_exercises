package exercises.decorator;

public class NotifierImpl implements Notifier {

    @Override
    public void sendNotification(String message) {
        System.out.println("Notifying by default method");
    }
}
