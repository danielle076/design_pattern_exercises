package solutions.adapter;

public class Main {
    public static void main(String[] args) {
        WeatherServiceAdapter service = new WeatherServiceAdapterImpl();

        double temperature = service.getTemperatureForCity("New York (NY)");
        System.out.printf("The temperature in New York is: %.2f Celsius", temperature);
    }
}
