public class Programador {

  private int id;
  private String nome, linguagem;
  
  public Programador(){
  }
  
  public Programador(String nome, String linguagem, int id){
    this.nome = nome;
    this.linguagem = linguagem;
    this.id = id;
  }
  
  public void setNome(String nome){
    this.nome = nome;
  }
  
  public void setLp(String linguagem){
    this.linguagem = linguagem;
  }
  
  public void setId(int id){
    this.id = id;
  }
  
  public String getNome(){
    return this.nome;
  }
  
  public String getLp(){
    return this.linguagem;
  }
  
  public int getId(){
    return this.id;
  }
  
  public String toString(){
    return "Programador {"+ " Nome= "+this.nome 
    + ", linguagem= "+ this.linguagem + ", ID: "+ this.id
    +" }";
    
  }
  
}
