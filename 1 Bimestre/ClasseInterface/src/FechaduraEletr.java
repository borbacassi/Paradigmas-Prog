public class FechaduraEletr implements Autenticavel,DispLigavel {
    private String senha;
    private int id;
    private boolean status;

    public FechaduraEletr(){}
    public FechaduraEletr(int id, String senha){
        this.id  = id;
        this.senha = senha;
        this.status = false;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public int getId() {
        return id;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public void ValAcesso(String senha) {
        if (this.senha.equals(senha)){
            this.status = true;
            System.out.println("Acesso validado");
        }
        else{
            this.status = false;
        }
    }

    @Override
    public void ligar() {
        if(status){
            System.out.println("Porta destrancada.");
        }
        else {
            System.out.println("Senha inválida");
        }
    }

    @Override
    public void desligar() {
        if(!status){

            System.out.println("Senha inválida");
        }
        else {
            System.out.println("Porta trancada.");
        }
    }

    @Override
    public String toString() {
        return "FechaduraEletr{" +
                "senha='" + senha + '\'' +
                ", id=" + id +
                ", status=" + status +
                '}';
    }
}
