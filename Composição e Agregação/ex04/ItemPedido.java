public class ItemPedido {
    private int id, qtd;
    private Produto produto;

    public ItemPedido(){

    }
    public ItemPedido(int id, Produto produto, int qtd){
        this.id =  id;
        this.produto =produto;
        this.qtd = qtd;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQtd() {
        return this.qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String toString(){
        return "Id: "+ this.id
                +" Produto: "+this.produto
                +" qtd: "+ this.qtd;
    }
}
