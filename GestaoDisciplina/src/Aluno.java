public class Aluno {
    private int id,ra;
    private String curso,nome;

    public Aluno(){

    }
    public Aluno(String nome,String curso,int id, int ra){
        this.setCurso(curso);
        this.setId(id);
        this.setNome(nome);
        this.setRa(ra);

    }
    public void setNome(String n){
        this.nome = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRa() {
        return this.ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNome() {
        return this.nome;
    }
    @Override
    public String toString(){
        return "Aluno: " + this.nome
                +" ID: "+ this.id
                +" RA: "+ this.ra
                +" Curso: "+ this.curso;
    }
}
