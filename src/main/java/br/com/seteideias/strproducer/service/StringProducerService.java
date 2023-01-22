package br.com.seteideias.strproducer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class StringProducerService {

    @Value("${spring.kafka.nomeDoTopico}")
    String nomeDoTopico;
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        kafkaTemplate.send(nomeDoTopico,message);
    }
}
