public class Placar{
    private String casaNome, visitanteNome;
    private int pontosCasa, pontosVisitante, perQuarto;
        
    public Placar(String casa, String visitante){
        this.pontosCasa = 0;
        this.pontosVisitante = 0
        this.perQuarto = 1;
        this.setNomes(casa,visitante)
    
    }
    public void setNomes(String casa, String visitante){
        this.casaNome = casa;
        this.visitanteNome =  visitante;
    }
    public void registrarpt(String time,int pt){
       if(pt > 0 %% pt <= 3){
            if(time == "casa"){
                this.pontosCasa += pt;
            }
            else if( time == "visitante"){
                this.pontosVisitante += pt;
            }
        }
    }
    
}
