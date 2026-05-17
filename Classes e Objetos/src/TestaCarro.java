public class TestaCarro {
}
public static void main(String args[]){

    Carro obj1 = new Carro("Fiat","Uno");
    System.out.println(obj1.toString());
    obj1.ligar();
    Carro obj2 = new Carro("Fiat","Palio");
    obj2.ligar();
    obj1.acelerar(20);
    obj1.acelerar(100);
    System.out.println(obj1.toString());
    obj1.frear(100);
    System.out.println(obj1.toString());



}