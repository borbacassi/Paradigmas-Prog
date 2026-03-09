public class Ac {
    private String marca, modelo;
    private int temp;
    private boolean ligado;

    public Ac(){

    }
    public Ac(String marca, String modelo){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.ligado = false;

    }
    public void setTemp(int val){
        if(val >= 16 && val <= 30){
            this.temp = val;
        }
        else{
            System.out.println("Temperatura fora da faixa.");
        }
    }
    public void setMarca(String m){
        if(m.length() < 3){
            System.out.println("MArca precisa ter mais de 3 caracteres.");
        }
        else{
            this.marca = m;
        }
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public boolean verComp(){
        int x = (int) (Math.random()*10);
        if(x > 2){
            return true;
        }
        else{
            return false;
        }
    }
    public void onTurbo(){
        if(verComp()){
            this.setTemp(16);
            System.out.println("Modo turbo ativado.");
        }
        else {
            System.out.println("Falha técnica, não foi possível ativar.");
        }
    }
    public void ligar(){
        if(this.ligado){
            System.out.println("Ac ligado, desligando...");
            this.ligado = false;
        }
        else{
            System.out.println("ligando Ac...");
            this.ligado = true;
        }
    }
    public String toString(){
        return "AC "+ this.marca +" "+this.modelo + " Ligado:" + (this.ligado ? "Sim ":"Não ")+ "temperatura:" + this.temp;
    }
}
