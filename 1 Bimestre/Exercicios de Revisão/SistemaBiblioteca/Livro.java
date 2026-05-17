public class Livro{
  private int id;
  private String titulo , autor;
  
  public Livro(){}
  
  public Livro(String t, String a, String id){
    this.titulo = t;
    this.autor = a;
    this.id = id;
    
  }
  
  public void setTitulo(String titulo){
    this.titulo = titulo;
  }
  
  public void setAutor(String autor){
    this.autor = autor;
  }
  
  public void setId(int id){
    this.id =  id;
  }
  
  public String getTitulo(){
    return this.titulo;

  }
  public String getAutor(){
    return this.autor;
  }
  
  public int getId(){
    return this.id;
  }
  
  public String toString(){
  return "Livro { " +"Titulo = " 
  + this.titulo + " Autor = " + this.autor 
  + " Id = " + this.id + " }";

  }
  
  
  
  
  
  
  
  
  
  
  
}
