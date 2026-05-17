public class TestaPlacar {
    static void main( String[] args) {
        Placar p1 = new Placar("A","B");
        p1.registrarpt("casa",2);
        System.out.println(p1.toString());
        p1.registrarpt("visitante",1);
        p1.registrarpt("ax",2);
        p1.registrarpt("visitante",4);
        p1.proxTemp();
        p1.proxTemp();
        p1.proxTemp();
        p1.proxTemp();
        System.out.println(p1.toString());

    }
}
