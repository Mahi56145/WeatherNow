package com.weathernow.cli;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherService {
    private final HttpClient client = HttpClient.newHttpClient();
    private final ObjectMapper mapper = new ObjectMapper();

    public WeatherApiResponse fetch(String location, String apiKey) throws Exception {
        String url = String.format("%s?q=%s&appid=%s&units=%s", Config.BASE_URL, uriEncode(location), apiKey, Config.DEFAULT_UNITS);
        HttpRequest request = HttpRequest.newBuilder().uri(new URI(url)).GET().build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        WeatherApiResponse apiResponse = mapper.readValue(response.body(), WeatherApiResponse.class);
        return apiResponse;
    }

    private String uriEncode(String s) {
        return s.replaceAll(" ", "%20");
    }
}
