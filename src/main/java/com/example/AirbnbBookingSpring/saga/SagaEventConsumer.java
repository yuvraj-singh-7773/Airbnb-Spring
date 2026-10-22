package com.example.AirbnbBookingSpring.saga;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import tools.jackson.databind.ObjectMapper;

import java.util.concurrent.TimeUnit;

public class SagaEventConsumer {
    private final String SAGA_QUEUE = "saga:events";
    private final RedisTemplate<String, String> redisTemplate;
    private final ObjectMapper objectMapper;


    @Scheduled(fixedDelay = 500) // poll events every 500ms
    public void consumeEvents() {
        String eventJson = redisTemplate.opsForList().leftPop(SAGA_QUEUE, 1, TimeUnit.SECONDS);
        if(eventJson != null && !eventJson.isEmpty()) {

        }
}
