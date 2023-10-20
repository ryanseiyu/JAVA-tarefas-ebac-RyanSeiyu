package br.com.ebac.demoeventos.produtor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eventos")
public class ProdutorController {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("kafka.ebac.nome.topico")
    private String nomeTopicoEbac;

    public void enviaMensagem(@RequestBody String mensagem) {
        kafkaTemplate.send(nomeTopicoEbac, mensagem);
    }
}
