package br.com.ebac.ebacfilas.consumidor;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import br.com.ebac.ebacfilas.configuracao.ConfiguracaoRabbitMQ;

@Component
@RabbitListener(queues = ConfiguracaoRabbitMQ.NOME_FILA)
public class Consumidor {
    @RabbitHandler
    public void consumirMensagem(String mensagem) {
        System.out.println("============= RECEBENDO MENSAGEM =============");
        System.out.println(mensagem);
        System.out.println("============= MENSAGEM RECEBIDA =============");
    }
}
