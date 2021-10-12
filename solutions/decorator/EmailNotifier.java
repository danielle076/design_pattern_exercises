package solutions.decorator;

public class EmailNotifier extends DecoratedNotifier {

    public EmailNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notifying by email");
        notifier.sendNotification(message);
    }
}
