package pl.sda.openweather;

public class Main {

    public static void main(String[] args) {

        WeatherService weatherService = new WeatherService(
                "http://api.apixu.com/v1/current.json",
                "13b4146ab016460c9e992445191002");

        weatherService.getCityWeather("Sydney");

    }
}
