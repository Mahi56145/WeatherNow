package com.weathernow.cli;

public class Ui {
    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";
    public static final String CYAN = "\u001B[36m";
    public static final String YELLOW = "\u001B[33m";
    public static final String GREEN = "\u001B[32m";
    public static final String MAGENTA = "\u001B[35m";
    public static void printHeader() {
         String header =
            "\n" +
            "██╗    ██╗███████╗ █████╗ ████████╗██╗  ██╗███████╗██████╗ ███╗   ██╗ ██████╗ ██╗    ██╗\n" +
            "██║    ██║██╔════╝██╔══██╗╚══██╔══╝██║  ██║██╔════╝██╔══██╗████╗  ██║██╔═══██╗██║    ██║\n" +
            "██║ █╗ ██║█████╗  ███████║   ██║   ███████║█████╗  ██████╔╝██╔██╗ ██║██║   ██║██║ █╗ ██║\n" +
            "██║███╗██║██╔══╝  ██╔══██║   ██║   ██╔══██║██╔══╝  ██╔══██╗██║╚██╗██║██║   ██║██║███╗██║\n" +
            "╚███╔███╔╝███████╗██║  ██║   ██║   ██║  ██║███████╗██║  ██║██║ ╚████║╚██████╔╝╚███╔███╔╝\n" +
            " ╚══╝╚══╝ ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝ ╚═════╝  ╚══╝╚══╝ \n";
        System.out.println(CYAN + BOLD + header + RESET);
        System.out.println(BOLD + MAGENTA + "WeatherNow — Professional CLI Weather App" + RESET + "\n");
    }

    public static void printWeather(WeatherApiResponse r) {
        if (r == null) {
            System.out.println(YELLOW + "No data available." + RESET);
            return;
        }
        if (r.cod != 200) {
            String msg = r.message == null ? "Unable to fetch weather." : r.message;
            System.out.println(YELLOW + "API returned: " + msg + RESET);
            return;
        }
        String city = r.name == null ? "Unknown" : r.name;
        String desc = (r.weather != null && r.weather.size() > 0 && r.weather.get(0).description != null) ? r.weather.get(0).description : "N/A";
        System.out.println(BOLD + GREEN + "Location: " + RESET + city);
        System.out.println(BOLD + "Temperature: " + RESET + String.format("%.1f °C", r.main.temp));
        System.out.println(BOLD + "Feels like: " + RESET + String.format("%.1f °C", r.main.feels_like));
        System.out.println(BOLD + "Humidity: " + RESET + r.main.humidity + " %");
        System.out.println(BOLD + "Pressure: " + RESET + r.main.pressure + " hPa");
        System.out.println(BOLD + "Condition: " + RESET + desc);
        System.out.println(BOLD + "Wind: " + RESET + String.format("%.1f m/s, %s°", r.wind.speed, String.valueOf(r.wind.deg)));
        System.out.println();
    }
}
