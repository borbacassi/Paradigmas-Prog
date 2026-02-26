public class Main{
    public static void main(String[] args) {
    
    Conta c1 = new Conta(123,1,"cassiano");
    System.out.println(c1.toString());
    c1.depositar(100);
    c1.sacar(50);
    c1.sacar(70);
    c1.encerrarConta();
    c1.sacar(50);
    c1.encerrarConta();
    System.out.println(c1.toString());

    
    }
    
}
