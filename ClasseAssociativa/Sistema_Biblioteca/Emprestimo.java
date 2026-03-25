import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Emprestimo{
    private LocalDate dataEmp, dataDev;
    private Leitor leitor;
    private Livro livro;
    
    public Emprestimo(){}
    
    public Emprestimo(LocalDate dataEmp, LocalDate dataDev, Leitor leitor, Livro livro){
        this.dataEmp = dataEmp;
        this.dataDev = dataDev;
        this.leitor = leitor;
        this.livro = livro;
    }
    
    public void setLeitor( Leitor leitor){
        this.leitor = leitor ;
    }
    public void setLivro(Livro livro ){
        this.livro = livro ;
    }
    public void setDataEmp(LocalDate dataEmp){
        this.dataEmp = dataEmp;
    }
    public void setDataDev(LocalDate dataDev){
        this.dataDev = dataDev;
    }
    
    public String toString(){
        DateTimeFormatter fdata = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Emprestimo { " + this.leitor.toString() + this.livro.toString()
        + " Data emprestimo: " + this.dataEmp.format(fdata) 
        + " Data devolução: " + this.dataDev.format(fdata);
    }
}
