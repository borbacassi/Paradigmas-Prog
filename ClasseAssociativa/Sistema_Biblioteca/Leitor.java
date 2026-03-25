public class Leitor{
    private int id;
    private String nome;
    
    public Leitor(){}
    
    public Leitor(String nome, int id){
        this.nome = nome;
        this.id  = id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNome(){
        return this.nome;
    }
    public int getId(){
        return this.id;
    }
    
    public String toString(){
        return "Leitor{ Nome: " + this.nome + " Id: " + this.id;
    }
    
}
