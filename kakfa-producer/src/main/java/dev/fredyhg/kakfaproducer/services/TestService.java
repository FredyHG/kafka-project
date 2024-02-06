package dev.fredyhg.kakfaproducer.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class TestService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void send(){
        log.info("PACKAGE SEND");
        kafkaTemplate.send("topic-1", "PACKAGE");
    }
}
