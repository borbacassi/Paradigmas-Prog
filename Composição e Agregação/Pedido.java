import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int id;
    private Date data;
    private Cliente cliente; //associação todo-parte
    private ArrayList<ItemPedido>itenspedido;
    public Pedido() {
        this.itenspedido = new ArrayList<>();
    }

    public Pedido(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.itenspedido = new ArrayList();// agregação pois o cliente vem pronto, eu atribuo ele ao pedido
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void addPed(int id, Produto produto, int qtd){
        ItemPedido aux = new ItemPedido(id,produto,qtd);
        this.itenspedido.add(aux);
    }
    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", data=" + data +
                ", cliente=" + cliente +
                ", Itens pedido" +this.itenspedido
                +// ele vai puxar a classe cliente (com id, nome e td mais) mas vai chamar o toString do cliente
                '}';
    }
}
