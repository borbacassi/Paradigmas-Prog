package dc.unifacef.Atv1.controller;

import dc.unifacef.Atv1.model.Cliente;
import dc.unifacef.Atv1.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;

@RestController
@RequestMapping("/cliente") //responde apenas solicitações do endpoint ("/cliente")
public class ClienteController {
    // injeção de dependência
    // permite chamar métodos com objetos não instanciados
    @Autowired
    private ClienteService clienteService;

    // requisição pelo verbo GET --> buscar dados
    @GetMapping
    public ResponseEntity<ArrayList<Cliente>> listar(){
        // retorna OK ao cliente
        // retorna a lista de clientes
        return ResponseEntity.ok(this.clienteService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscaID( @PathVariable int id){
        Cliente c = clienteService.buscar(id);
        return (c != null) ? ResponseEntity.ok(c) : ResponseEntity.notFound().build();
    }
    //verbo POST --> CRIAR DADOS
    @PostMapping
    public ResponseEntity<Cliente> criar(@RequestBody Cliente cliente){
        Cliente novo = clienteService.criar(cliente);
        URI uri  = URI.create("/produto/" + novo.getId());
        return ResponseEntity.created(uri).body(novo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Cliente> deletar(@PathVariable Long id){
        if(clienteService.remover(id)){
            return ResponseEntity.noContent().build();
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable long id,
                                             @RequestBody Cliente cliente){
        Cliente resposta = clienteService.atualiza(id, cliente);
        return (resposta != null) ? ResponseEntity.ok(resposta) :
                ResponseEntity.notFound().build();

    }

}
