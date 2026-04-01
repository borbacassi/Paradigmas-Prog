import java.util.ArrayList;

public class Time{
  private int id;
  private String nome, tecnico;
  private ArrayList<Atleta> atletas;
  
  public Time(){
    atletas = new ArrayList<Atleta>();
  }
  
  public Time(String nome, String tecnico, int id){
    
    this.nome = nome;
    this.tecnico = tecnico;
    this.id = id;
    atletas = new ArrayList<Atleta>();
  }
  
  public void setNome(String nome){
    this.nome  = nome;
  }
  
  public void setTec(String tecnico){
    this.tecnico = tecnico;
  }
  
  public void setId(int id){
    this.id  = id;
  }
  
  public String getNome(){
    return this.nome;
  }
  
  public String getTec(){
    return this.tecnico;
  }
  
  public int getId(){
    return this.id;
    
  }
  public void contratar(Atleta a){
    atletas.add(a);
  }
  
  public String toString(){
    return "Time {" + " Nome: " + this.nome + ", tecnico: "
    +this.tecnico + " , Id: "+ this.id + " Atletas: "
    + this.atletas + " }";
  }
  
  
}
