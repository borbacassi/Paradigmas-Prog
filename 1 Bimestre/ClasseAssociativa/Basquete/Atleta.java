public class Atleta{
    private int id;
    private String nome, posicao;
    
    public Atleta(){}
    
    public Atleta(String nome, String posicao, int id){
        this.nome = nome; 
        this.posicao = posicao;
        this.id = id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPosicao(String posicao){
        this.posicao = posicao;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNome(){
        return this.nome;
    }
    public String getPosicao(){
        return this.posicao;
    }
    public int getId(){
        return this.id;
    }
    
}
