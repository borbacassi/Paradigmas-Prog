public class Aluno{
    private int id;
    private String nome, ra,curso;
    
    public Aluno(){
        
    }
    public Aluno(int id, String nome, String ra, String curso){
        this.setNome(nome);
        this.setId(id);
        this.setRa(ra);
        this.setCurso(curso);
        
    }
    public void setNome(String n){
        this.nome = n;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setRa(String r){
        this.ra = r;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCurso(){
        return this.curso;
    }
    public String getRa(){
        return this.ra;
    }
    public int getId(){
        return this.id;
    }
    
    public String toString(){
        return "Aluno: "+this.nome
        +" ID: " + this.id 
        +" Curso: " + this.curso
        + " R.A: " + this.ra;
    }
    
}
