import java.time.LocalDate;
public class Emprestimo{
  private LocalDate dataEmp, dataDev;
  private Livro livro;
  private Leitor leitor;
  
  
  public Emprestimo(){}
  
  public Emprestimo(Leitor leitor, Livro livro, LocalDate dataEmp, LocalDate dataDev){
    this.leitor = leitor;
    this.livro  = livro;
    this.dataDev = dataDev;
    this.dataEmp = dataEmp;
    
  }
  
  public void setLeitor(Leitor leitor){
    this.leitor = leitor;
  }
  
  public void setLivro( Livro livro){
    this.livro = livro;
  }
  
  public void setDataEmp(LocalDate dataEmp){
    this.dataEmp =  dataEmp;
  }
  
  public void setDataDev(LocalDate dataDev){
    this.dataDev = dataDev;
  }
  
  public LocalDate getDataEmp(){
    return this.dataEmp;
  }
  public LocalDate getDataDev(){
    return this.dataDev;
  }
  
  public String toString(){
    return "Emprestimo { "+ livro.toString() + leitor.toString();
  }
  
  
  
  
  
  
}
