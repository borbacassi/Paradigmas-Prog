public class Placar {
    private String casaNome, visitanteNome;
    private int pontosCasa, pontosVisitante, perQuarto;

    public Placar(String casa, String visitante) {
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.perQuarto = 1;
        this.setNomeCasa(casa);
        this.setNomeVisitante(visitante);

    }

    public void setNomeCasa(String casa) {
        this.casaNome = casa;
    }

    public void setNomeVisitante(String visitante) {
        this.visitanteNome = visitante;
    }

    public void registrarpt(String time, int pt) {
        if (time.equals("casa")) {
            switch (pt) {
                case 1:
                    this.pontosCasa += 1;
                    System.out.println("lance livre convertido");
                    break;
                case 2:
                    this.pontosCasa += 2;
                    System.out.println("cesta de 2 convertida.");
                    break;
                case 3:
                    this.pontosCasa += 3;
                    System.out.println("cesta de 3 convertida.");
                    break;
                default:
                    System.out.println("valor inválido.");
                    break;
            }
        }
        else if(time.equals("visitante")){
            switch (pt){
                case 1:
                    this.pontosVisitante += 1;
                    System.out.println("lance livre convertido");
                    break;
                case 2: this.pontosVisitante += 2;
                    System.out.println("cesta de 2 convertida.");
                    break;
                case 3: this.pontosVisitante +=3;
                    System.out.println("cesta de 3 convertida.");
                    break;
                default:
                    System.out.println("valor inválido.");
                    break;
            }
        }
        else{
            System.out.println("time inválido.");
        }
    }
    public void proxTemp() {
        if (this.perQuarto == 4) {
            System.out.println("fim do " + this.perQuarto+" tempo");
            System.out.println("Jogo acabou.");
        } else {
            System.out.println("fim do " + this.perQuarto+" tempo");
            this.perQuarto += 1;
        }
    }

    public String toString(){
        return "TIME CASA: " + this.casaNome
                + " Pontos: "+ this.pontosCasa
                + " x "
                + "TIME VISITANTE " + this.visitanteNome
                + " Pontos: " + this.pontosVisitante
                + " Período: " + this.perQuarto;
    }

}
