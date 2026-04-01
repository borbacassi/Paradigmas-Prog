import java.util.*;

public class Main {
    public static void main(String[] args) {
      Time t1 = new Time("t1","tec1",10);
      Atleta a1 = new Atleta("n1","p1",9);
      Atleta a2 = new Atleta("n2","p2",11);
      
      t1.contratar(a1);
      t1.contratar(a2);
      System.out.println(t1.toString());
      t1 = new Time();
      System.out.println(t1.toString());
      System.out.println(a1.toString());
    }
}
