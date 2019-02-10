package pl.sda.openweather;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.openweather.model.Weather;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class WeatherService {
    private String finalURL;
    private String url;
    private String apiKey;

    public WeatherService(String url, String apiKey) {
        this.url = url;
        this.apiKey = apiKey;
    }


    public void getCityWeather(String city) {
        String urlwithApiKey = null;

        apiKey = "?key=" + apiKey + "&q=";

        try {
            urlwithApiKey = String.valueOf(new URL(url + apiKey));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        finalURL = urlwithApiKey + city;

        URL jsonURL = null;
        try {
            jsonURL = new URL(finalURL);
            ObjectMapper objectMapper = new ObjectMapper();
            Weather weather = objectMapper.readValue(jsonURL, Weather.class);
            System.out.println(weather);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
