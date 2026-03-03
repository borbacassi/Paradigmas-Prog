public class Streaming {
	private String usuario, plano, ultimofilme;
	private double mensalidade;
	private boolean status;

	public Streaming(String usuario, String plano) {
		this.setNome(usuario);
		this.setPlano(plano);
		this.status = true;
		this.ultimofilme = null;
		if(plano.toLowerCase() == "basico") {
			this.mensalidade  = 25.90;
		}
		else if(plano.toLowerCase() == "premium") {
			this.mensalidade  = 45.90;
		}
		else if(plano.toLowerCase() == "familia") {
			this.mensalidade  = 60.90;
		}
		
	}
    public void setNome(String nome){
        this.usuario = nome;
        }
    public void setPlano(String plano){
        this.plano = plano;
        
    }
    public void assistir(String filme){
        if(status){
            this.ultimofilme = filme;
            System.out.println("Assistindo: " + filme+".");
        }
        else{
            System.out.println("Não foi possível assistir. Conta inativa.");
        }
    }
    public void cancelar(){
        this.status = false;
    }
    
	public String toString() {
		return "Nome: " + this.usuario
		       + " Plano: " + this.plano + " Status: "
		       + (this.status ? "Ativo" : "Suspenso") +
		       " Mensalidade: " + this.mensalidade 
		       +" Ultimo filme assistido: " + ultimofilme;
	}
}
