import java.util.ArrayList;

public class Projeto{
  private int id;
  private String NomeP;
  private ArrayList<Programador> devs;
  
  
  public Projeto(){
    devs = new ArrayList<Programador>();
  }
  
  public Projeto(String NomeP , int id){
    
    this.NomeP = NomeP;
    this.id = id;
    devs = new ArrayList<Programador>();
  }
  
  public void setNomeP(String NomeP){
    this.NomeP  = NomeP;
  }

  
  public void setId(int id){
    this.id  = id;
  }
  
  public String getNomeP(){
    return this.NomeP;
  }
  
 
  
  public int getId(){
    return this.id;
    
  }
  
  public void incluir(Programador dev){
    devs.add(dev);
  }
  
  public void exibirDevs(){
    for(Programador dev : devs){
      System.out.println(dev);
    }
  }
  
  public String toString(){
    return "Projeto {" + " NomeP: " + this.NomeP 
    +  ", ID: "+ this.id  + "Devs: " + this.devs
    + " }";
  }
  
  
}
