public class Questao{
    private int numero;
    private float valor;
    private String enunciado;
    
    public Questao(){
        
    }
    public Questao(String enunciado, int numero, float valor){
        this.setEnun(enunciado);
        this.setNumero(numero);
        this.setValor(valor);
    }
    public void setEnun(String e){
        this.enunciado = e;
    }
}
