package solutions.decorator;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new SlackNotifier(new EmailNotifier(new NotifierImpl()));
        notifier.sendNotification("Test message");
    }
}
