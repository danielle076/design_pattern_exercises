package solutions.singleton;

public class Main {
    public static void main(String[] args) {
        ConfigurationService service1 = ConfigurationService.getInstance();
        ConfigurationService service2 = ConfigurationService.getInstance();
        ConfigurationService service3 = ConfigurationService.getInstance();

        service1.setSecret("test secret");

        System.out.println(service1.getSecret());
        System.out.println(service2.getSecret());
        System.out.println(service3.getSecret());
    }
}
