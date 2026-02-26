public class Conta
{
	public int numConta, agencia;
	public float saldo = 0;
	public boolean status = true;
	public String nome;
	
	public Conta(int numConta, int agencia, String nome ){
	    this.numConta = numConta; this.agencia = agencia;
	    this.nome = nome;
	}
	public void depositar(float valor){
	    if(status){
	        this.saldo += valor;
	        System.out.println("novo valor = "+ this.saldo);
	    }
    }
    public void sacar(int valor){
        if(status && valor <= this.saldo){
            this.saldo -= valor;
            System.out.println("novo valor = "+ this.saldo);
        }
        else{
           System.out.println("Não foi possível sacar. Saldo insuficiente.");
            
        }
    }
    public void encerrarConta(){
        if(status && saldo <= 0){
            this.status = false;
            System.out.println("Conta Encerrada.");
        }
        else{
            System.out.println("Retire o saldo antes.");
        }
    }
    public String toString(){
        return "Nome: "+ this.nome+ " Status: "+ (this.status ? "Ativa":"Inativa")
        +" Agência: "+ this.agencia + " Conta: "+ this.numConta + " Saldo Atual: "+ this.saldo;
    }
}
