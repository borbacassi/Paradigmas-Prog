public abstract class Veiculo {
    protected String placa;
    protected double capacidadeCarga;

    public Veiculo(){}

    public Veiculo( String placa, double capacidade){
     this.placa = placa;
     this.capacidadeCarga = capacidade;
    }

    public void exibirDados(){
        System.out.println("Placa: " + this.placa+ " Capacidade de Carga: " + this.capacidadeCarga);
    }
    public abstract double calcularCustoViagem(double distancia);

}
