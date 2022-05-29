package com.berkin.teushka.telegram.service;

import com.berkin.teushka.telegram.dto.Webhook;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class WebhookService {

    private final WebClient webClient;

    public WebhookService() {
        this.webClient =
                WebClient.builder()
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.MULTIPART_FORM_DATA_VALUE)
                .build();
    }

    private Boolean initializeWebhook(){
        Webhook webhook = new Webhook();
        webhook.set
        webClient.post()
                .uri("")
                .body()
    }
}
