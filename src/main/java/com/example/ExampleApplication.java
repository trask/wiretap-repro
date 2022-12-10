package com.example;

import io.netty.handler.logging.LogLevel;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.netty.http.client.HttpClient;
import reactor.netty.http.client.HttpClientResponse;
import reactor.netty.transport.logging.AdvancedByteBufFormat;

@SpringBootApplication
public class ExampleApplication {

    public static void main(String[] args) {
        HttpClientResponse response = HttpClient.create()
            .wiretap("reactor.netty.http.client.HttpClient",
                LogLevel.DEBUG, AdvancedByteBufFormat.TEXTUAL)
            .get()
            .uri("https://example.com")
            .response()
            .block();

        System.out.println(response);
    }
}
