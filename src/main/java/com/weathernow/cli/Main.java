package com.weathernow.cli;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ui.printHeader();
        String apiKey = System.getenv(Config.API_KEY_ENV);
        if (apiKey == null || apiKey.isBlank()) {
            System.out.println("ERROR: OPENWEATHER_API_KEY environment variable not set.");
            System.out.println("Set the API key and re-run. See README for instructions.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter city or 'q' to quit: ");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye.");
                break;
            }
            if (input.isEmpty()) {
                System.out.println("Please enter a city name.");
                continue;
            }
            try {
                WeatherService service = new WeatherService();
                WeatherApiResponse resp = service.fetch(input, apiKey);
                Ui.printWeather(resp);
            } catch (Exception e) {
                System.out.println("Failed to fetch weather: " + e.getMessage());
            }
        }
    }
}
