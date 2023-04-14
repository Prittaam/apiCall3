package org.example;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws  Exception {
        String url = "https://api.nationalize.io/?name=nathaniel";
        //Building a request
        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        //getting http client request
        HttpClient httpClient = HttpClient.newBuilder().build();
        HttpResponse<String> httpResponse = httpClient.send(request,HttpResponse.BodyHandlers.ofString());
        System.out.println(httpResponse.statusCode());
        System.out.println(httpResponse.body());
    }
}