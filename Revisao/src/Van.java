public class Van extends Veiculo{
    private boolean refrigerada;

    public Van(){
        super();
    }
    public Van( String placa, double capacidade, boolean refrigerada){
        super(placa,capacidade);
        this.refrigerada = refrigerada;
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        if (refrigerada){
            return distancia * 3 + 100;
        }
        else{
            return distancia * 3;
        }
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
    }
}
