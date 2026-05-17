public class Produto {
    private int id;
    private String nome, descricao;
    private float preco;

    public Produto(){

    }
    public Produto(int id, String nome, String descricao, float preco){
        this.id = id;
        this.nome= nome;
        this.descricao = descricao;
        this.preco = preco;
    }
    public void setId(int val){
        this.id = val;
    }
    public int getId(){
        return this.id;
    }
    public void setNome(String n){
        this.nome = n;
    }

    public void setDes(String d){
        this.descricao = d;
    }
    public void setPreco(float p){
        this.preco = p;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }
    public float getPreco() {
        return this.preco;
    }
    public String toString(){
        return "Nome: " + this.nome
                + " Descrição: " + this.descricao
                + " Preço: "+ this.preco;

    }
}
