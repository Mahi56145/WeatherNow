package com.weathernow.cli;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherApiResponse {
    public String name;
    public Main main;
    public List<Weather> weather;
    public Wind wind;
    public int cod;
    public String message;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Main {
        public double temp;
        public double feels_like;
        public int humidity;
        public double pressure;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Weather {
        public int id;            // maps "id"
        public String main;
        public String description;
        public String icon;       // maps "icon"
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Wind {
        public double speed;
        public double deg;
    }
}
