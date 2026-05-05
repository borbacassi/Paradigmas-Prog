package dc.unifacef.ExemploMemoria.model;

public class Produto {
    private Long id;
    private String nome;
    private Integer estoque;
    private Double preco;

    public Produto(Long id, String nome, Integer estoque, Double preco) {
        this.id = id;
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

