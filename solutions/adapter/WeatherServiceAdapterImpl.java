package solutions.adapter;

public class WeatherServiceAdapterImpl implements WeatherServiceAdapter {
    private ImperialWeatherService imperialWeatherService;

    public WeatherServiceAdapterImpl() {
        this.imperialWeatherService = new ImperialWeatherServiceImpl();
    }

    @Override
    public double getTemperatureForCity(String city) {
        double temperatureInFahrenheit = this.imperialWeatherService.getTemperatureForCity(city);
        return (temperatureInFahrenheit - 32) * (5.0 / 9.0);
    }
}
