package com.example.democlient.auth;



import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {


    @Bean
    public RestTemplate template(){
        return new RestTemplate();
    }
}
