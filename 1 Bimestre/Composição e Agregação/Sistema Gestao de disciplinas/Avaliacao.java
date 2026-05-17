import java.util.ArrayList;

public class Avaliacao {
    private int id;
    private String nome;
    private ArrayList<Questao> questoes;

    public  Avaliacao(){
        this.questoes = new ArrayList<>();
    }
    public Avaliacao(String nome, int id){
        this.nome = nome;
        this.id = id;
        this.questoes = new ArrayList<>();
    }
    public void addQ(String e, int n, float v){
        Questao aux = new Questao(e,n,v);
        this.questoes.add(aux);

    }
    public void remQ(Questao questao){
        this.questoes.remove(questao);
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

    public ArrayList<Questao> getQuestoes() {
        return this.questoes;
    }

    public void setQuestoes(ArrayList<Questao> questoes) {
        this.questoes = questoes;
    }
    @Override
    public String toString(){
        return this.nome + " ID: "+ this.id
                + "Questoes = " + this.questoes;
    }
}
