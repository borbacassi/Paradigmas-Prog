import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome, prof;
    private ArrayList<Aluno> alunos;
    private ArrayList<Avaliacao> avaliacoes;

    public Disciplina() {
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public Disciplina(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.avaliacoes = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public void matricular(Aluno a) {
        this.alunos.add(a);
    }

    public void remAluno(Aluno a) {
        this.alunos.remove(a);
    }

    public Avaliacao criaAv(String nome, int id) {
        Avaliacao aux = new Avaliacao(nome, id);
        this.avaliacoes.add(aux);
        return aux;
    }

    @Override
    public String toString() {
        return "Disciplina: " + this.nome + " | ID: " + this.id
                + "\n  Alunos: " + this.alunos
                + "\n  Avaliações: " + this.avaliacoes;
    }
}
