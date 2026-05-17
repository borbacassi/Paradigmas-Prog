import java.util.ArrayList;

public class TestaCanais{
    public static void main(String args[]){
        ArrayList<CanalNotificacao> canais =  new ArrayList<CanalNotificacao>();
        Email em = new Email("Dfpires@gmail.com","Olá Dani!","Mensagem");
        Sms sms = new Sms("Daniel","Sms txt",992929998);
        Whatsapp wpp = new Whatsapp("P","oii","visto");

        canais.add(em);
        canais.add(sms);
        canais.add(wpp);

        for(CanalNotificacao canal : canais){
            canal.enviar();
        }

    }
}
