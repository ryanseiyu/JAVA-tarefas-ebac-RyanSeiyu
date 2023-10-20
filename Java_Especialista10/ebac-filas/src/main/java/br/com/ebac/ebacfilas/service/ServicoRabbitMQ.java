package br.com.ebac.ebacfilas.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.ebac.ebacfilas.configuracao.ConfiguracaoRabbitMQ;

@Component
public class ServicoRabbitMQ {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void enviaMensagem(String mensagem) {
        rabbitTemplate.convertAndSend(ConfiguracaoRabbitMQ.NOME_EXCHANGE, "ebac.rota.mensagem", mensagem);
    }
}
