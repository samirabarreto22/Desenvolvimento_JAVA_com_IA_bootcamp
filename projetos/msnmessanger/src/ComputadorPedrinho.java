package projetos.msnmessanger.src;

public class ComputadorPedrinho {
    public static void main(String[] args){
        // abrindo MSN Messanger
        MSNMessanger msn = new MSNMessanger();
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessanger fcb = new FacebookMessanger();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem(); 
    }

 }
