public class Medico {
    private int id;
    private String nome, especialidade;

    public Medico(){}
    public Medico(String nome,String especialidade, int id){
    this.nome = nome;
    this.id = id;
    this.especialidade = especialidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    @Override
    public String toString(){
        return "Médico: " + this.nome
                +" Especialidade: "+ this.especialidade
                +" ID: " + this.id;
    }
}
