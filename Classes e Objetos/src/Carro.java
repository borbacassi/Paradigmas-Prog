public class Carro {
  public String marca, modelo;
  public float velocidade;
  public boolean motor;

  //converte o obj em string

  public Carro(String marca, String modelo) {

    this.marca = marca;
    this.modelo = modelo;
    this.velocidade = 0;
    this.motor = false;
  }
  public void ligar(){
    if(!this.motor) {
      this.motor = true;
      System.out.println("Motor ligado.");
    }
  }
  public void desligar(){
    if(this.motor) {
      this.motor = false;
      System.out.println("Motor desligado.");
    }
  }
  public void acelerar(float x){
    if (this.motor) {
      this.velocidade += x;
      System.out.println("Nova velocidade: "+ this.velocidade);
    }
    else{
      System.out.println("Motor está desligado.");
    }
  }
  public void frear(float x){
    if(this.motor && (this.velocidade - x) >= 0){
      this.velocidade -= x;
      System.out.println("Nova velocidade:" + this.velocidade);
    }
    else {
      System.out.println("Não foi possível frear");
    }

  }
  public String toString(){
    return "Marca: " + this.marca + " Modelo: " + this.modelo
            + " Motor: "+ (this.motor ?"Ligado": "Desligado") + " Velocidade: "+this.velocidade;

  }
}