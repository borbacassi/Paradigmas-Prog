package dc.unifacef.ExemploMemoria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //classe responsavel por controlar requisicoes REST
@RequestMapping("/produto") // aclasse responde somente solicitacoes do endpoint produto
public class ProdutoController {

    //requisicao pelo verbo GET
    @GetMapping
    public String mensagem(){
        return "Hello World";
    }


}
