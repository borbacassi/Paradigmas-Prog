import java.util.ArrayList;
void main() {
Empresa e1 = new Empresa("abc");
Veiculo v1 = new Caminhao("ahx234s",600,1);
Veiculo v2 = new Van("sadakj23",300,true);
e1.addVeiculo(v1);
e1.addVeiculo(v2);
e1.gerarRelatorioCustos(300);
}
