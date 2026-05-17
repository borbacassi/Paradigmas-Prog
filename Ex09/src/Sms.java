public class Sms extends CanalNotificacao{
    private int numTel;

    public Sms(){
        super();
    }

    public Sms(String destinatario, String mensagem, int numTel){
        super(destinatario,mensagem);
        this.numTel = numTel;
    }

    public void enviar(){
        System.out.println("Enviando SMS para o numero "
                + this.numTel + ": "+ this.mensagem);
    }

    public int getNumTel() {
        return numTel;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

    @Override
    public String toString() {
        return super.toString()
                +"numTel =" + this.numTel +"}";
    }
}
