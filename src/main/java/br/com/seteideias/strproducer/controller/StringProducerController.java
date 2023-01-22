package br.com.seteideias.strproducer.controller;

import br.com.seteideias.strproducer.service.StringProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1")
public class StringProducerController {
    private final StringProducerService service;

    @PostMapping
    public ResponseEntity<?> controllerPrincipal(@RequestBody String mensagem) {
        service.sendMessage(mensagem);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
