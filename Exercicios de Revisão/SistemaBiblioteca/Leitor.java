import java.util.ArrayList;

public class Leitor{
  private int id;
  private String nome;
  
  public Leitor(){}
  
  public Leitor(String nome, int id){
    
    this.id = id;
    this.nome = nome;
  }
  
  public String getNome(){
    return this.nome;
  }
  
  public void setNome(String nome){
    this.nome = nome;
    
  }
  
  public int getId(){
    return this.id;
  }
  public void setid(int id){
    this.id = id;
  }
  
  public String toString(){
    return "Leitor { " + this.nome +
    " ID: " + this.id + "}";
  }

}
