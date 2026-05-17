import java.util.Date;

public class TestaTodoParte {
    static void main( String[] args){
        // cliente é independente do pedido
        Cliente c1 = new Cliente(100,"Fulano","123","Rua 10");
        Pedido p1 = new Pedido(001, new Date(),c1);
        Produto pr1 = new Produto(12,"pen","a pen",3);
        p1.addPed(11,pr1,2);

        Produto sm = new Produto(13,"Phone","a phone",100);
        p1.addPed(12,sm,3);
        System.out.println(p1.toString());
    }
}
