package solutions.decorator;

public class SlackNotifier extends DecoratedNotifier {
    public SlackNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notifying by Slack");
        notifier.sendNotification(message);
    }
}
