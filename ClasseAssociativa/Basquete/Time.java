import java.util.ArrayList;

public class Time{
    private int id;
    private String nome,tecnico;
    private ArrayList<Atleta> atletas;
    
    public Time(){
        this.atletas = new ArrayList<Atleta>();
    }
    
    public Time(String nome, String tecnico, int id){
        this.nome = nome;
        this.tecnico = tecnico;
        this.id = id;
        this.atletas = new ArrayList<Atleta>();
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setTecnico(String tecnico){
        this.tecnico = tecnico;
    }
    public void contratar(Atleta a){
        this.atletas.add(a);
    }
    
    
}
