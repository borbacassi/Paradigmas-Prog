public class TestaStreaming
{
	public static void main(String[] args) {
	    Streaming f1 = new Streaming("Cassiano","premium");
	    System.out.println(f1.toString());
	    f1.assistir("Filme 100");
	    f1.assistir("abc");
	    f1.cancelar();
	    f1.assistir("Filme 10045");
	    System.out.println(f1.toString());
	    
	}
		
}
