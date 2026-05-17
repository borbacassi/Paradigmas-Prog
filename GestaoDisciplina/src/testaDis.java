public class testaDis{
    static void main(String[] args) {
        Aluno a1 = new Aluno("Cassi","ES",26215,101);
        Aluno a2 = new Aluno("ze","ES",33,122);
        Disciplina d1 = new Disciplina("POO",1);
        d1.matricular(a1);
        d1.matricular(a2);

        Avaliacao av1 = d1.criaAv("Prova Semestral",1);
        av1.addQ("Enunciado 1",1,2);
        av1.addQ("Enunciado 2",2,2);
        av1.addQ("enunciado 3",3,2);
        System.out.println(d1.toString());
    }
}
