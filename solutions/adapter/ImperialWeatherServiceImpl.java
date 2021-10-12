package solutions.adapter;

import java.util.HashMap;
import java.util.Map;

public class ImperialWeatherServiceImpl implements ImperialWeatherService {
    public static Map<String, Double> ACTUAL_TEMPERATURE_DATABASE;

    static {
        ACTUAL_TEMPERATURE_DATABASE = new HashMap<>();
        ACTUAL_TEMPERATURE_DATABASE.put("New York (NY)", 62.6);
        ACTUAL_TEMPERATURE_DATABASE.put("Washington (WA)", 66.2);
        ACTUAL_TEMPERATURE_DATABASE.put("Orlando (FL)", 84.2);
    }

    @Override
    public double getTemperatureForCity(String city) {
        if (ACTUAL_TEMPERATURE_DATABASE.containsKey(city)) {
            return ACTUAL_TEMPERATURE_DATABASE.get(city);
        } else {
            throw new RuntimeException(String.format("No weather data is known for city %s", city));
        }
    }
}
