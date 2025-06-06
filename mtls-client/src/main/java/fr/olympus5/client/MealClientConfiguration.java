package fr.olympus5.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MealClientConfiguration {
    @Bean
    public RestTemplate restTemplate(@Value("${server.port:8000}") int port) {
        return new RestTemplateBuilder()
                .rootUri(String.format("http://localhost:%s", port))
                .build();
    }
}
