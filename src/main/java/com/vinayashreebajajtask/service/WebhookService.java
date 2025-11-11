package com.vinayashreebajajtask.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class WebhookService implements CommandLineRunner {

    @Override
    public void run(String... args) {
        System.out.println("WebhookService started running...");

        String url = "https://bfhldevapigw.healthrx.co.in/hiring/generateWebhook/JAVA";

        Map<String, String> body = new HashMap<>();
        body.put("name", "Vinayashree N Ghatkamble");
        body.put("email", "vinaya212044@gmail.com");

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Map<String, String>> entity = new HttpEntity<>(body, headers);

        RestTemplate restTemplate = new RestTemplate();

        try {
            ResponseEntity<String> response = restTemplate.postForEntity(url, entity, String.class);
            System.out.println("Response: " + response.getBody());
        } catch (HttpClientErrorException | HttpServerErrorException ex) {
            System.out.println(" Error: " + ex.getStatusCode());
            System.out.println("Response Body: " + ex.getResponseBodyAsString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
