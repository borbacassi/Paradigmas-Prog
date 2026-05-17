package dc.unifacef.Atv1.service;

import dc.unifacef.Atv1.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClienteService {
    ArrayList<Cliente> clientes = new ArrayList<>(); //cria lista simulando um bd

    private long cont = 1; //gerar ids automaticamente

    public ArrayList<Cliente> listar() {
        return this.clientes;
    }

    public Cliente criar(Cliente c) {
        c.setId(cont);
        cont++;
        clientes.add(c);
        return c;
    }

    public Cliente buscar(long id) {
        for (Cliente c : clientes) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    public boolean remover(long id) {
        return this.clientes.remove(buscar(id));
    }

    public Cliente atualiza(Long id, Cliente novo) {
        novo.setId(id);
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId().equals(id)) { // encontrou
                clientes.set(i, novo); // atualiza o cliente na lista
                return novo; // retorna o novo cliente
            }
        } return null;
    }
}
