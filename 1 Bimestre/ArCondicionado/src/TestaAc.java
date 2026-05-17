public class TestaAc{
    static void main(String[] args) {
        Ac a1 = new Ac("Lg1","FF");
        a1.ligar();
        a1.setTemp(31);
        a1.onTurbo();
        System.out.println(a1.toString());
    }
}
