import java.util.ArrayList;

public class Empresa {
    private String nome;
    private ArrayList<Veiculo>veiculos;

    public Empresa(){
        this.veiculos = new ArrayList<>();
    }

    public Empresa(String nome){
        this.nome = nome;
        this.veiculos = new ArrayList<>();
    }

    public void addVeiculo(Veiculo v){
        this.veiculos.add(v);
    }
    public void gerarRelatorioCustos(double distancia){
        for(Veiculo v:this.veiculos){
            System.out.println(v.calcularCustoViagem(distancia));
        }
    }
}
