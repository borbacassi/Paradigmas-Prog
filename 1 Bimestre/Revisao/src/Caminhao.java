public class Caminhao extends Veiculo{
    private int qtdEixos;

    public Caminhao(){
        super();
    }
    public Caminhao(String placa, double capacidade, int qtdEixos){
        super(placa,capacidade);
        this.qtdEixos = qtdEixos;
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        return 5 * distancia  + this.qtdEixos*50;
    }
}
