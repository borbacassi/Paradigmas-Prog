public class Paciente {
    private int id;
    private String nome;
    private String cpf;

    public Paciente() {
    }

    public Paciente(String nome, String cpf, int id) {
        this.nome = nome;
        this.cpf = cpf;
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString() {
        return "Nome: " + this.nome + " CPF: " + this.cpf + " ID: " + this.id;
    }
}
