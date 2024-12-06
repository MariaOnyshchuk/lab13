package ua.edu.ucu.task3;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BrandFetchReader {
    private static final String BRAND_FETCH_URL = "https://api.brandfetch.io/v2/brands/";
    private static final String API_KEY = "Oh3ZJQJ3VO16jrcN551wOgEj7SyBl9fIXIizHPU4BGQ=";

    @SneakyThrows
    public Company fetch(String companyName){
        HttpClient httpClient = HttpClient.newHttpClient();

        HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(new URI(BRAND_FETCH_URL+companyName)).header("Authorization", "Bearer "+API_KEY).build();
        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        ObjectMapper objectMapper = new ObjectMapper();


        return objectMapper.readValue(response.body(), Company.class);

    }
}
