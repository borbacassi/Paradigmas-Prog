public class Questao {
    private int numero;
    private float valor;
    private String enunciado;

    public Questao(){
    }
    public Questao(String e, int numero, float v){
        this.enunciado = e;
        this.numero = numero;
        this.valor = v;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getEnunciado() {
        return this.enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    @Override
    public String toString(){
        return "Questão: "+ this.numero
                +this.enunciado
                +" Valor: "+ this.valor;
    }
}
