package projetos.msnmessanger.src;

public class Telegram extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        System.out.println("enviando msg pelo telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("recebendo msg pelo telegram");
    }

    
}
