package solutions.builder;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger.Builder().withPrefix("PRE").withPostfix("POST").includesDate(true).build();
        logger.log("Test message");
    }
}