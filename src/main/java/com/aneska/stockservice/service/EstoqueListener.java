package com.aneska.stockservice.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EstoqueListener {
    @KafkaListener(topics = "estoque-topico", groupId = "estoque-group")
    public void processarVenda(String mensagem) {
        //logica para atualizar estoque
        System.out.println("Venda recebida: " + mensagem);
    }
}

