package Java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HTTPClientAPI
{
    public static void main(String[] args){
        String uri = "https://postman-echo.com/get?uname=javabeam$pwd=12131";
        // http request
        HttpRequest req= HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .GET()
                //.header("" , value)
                .version(HttpClient.Version.HTTP_2)
                .build();

        // clent http
        HttpClient client = HttpClient.newBuilder()
                .build();
        try{
            // cient send request to server and accepting response
            HttpResponse<String> resp = client.send(req , HttpResponse.BodyHandlers.ofString());
            System.out.println(resp.statusCode());
            System.out.println(resp.body());

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}
