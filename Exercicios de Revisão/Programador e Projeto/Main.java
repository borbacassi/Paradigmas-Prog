import java.util.*;

public class Main {
    public static void main(String[] args) {
    Programador d1 = new Programador("d1","java",10);
    Programador d2 = new Programador("d2","sql",11);
    Projeto p1 = new Projeto("np",12);
    p1.incluir(d1);
    p1.incluir(d2);
    p1.exibirDevs();
  }
}
