package projetos.msnmessanger.src.apps;

public class Telegram extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        System.out.println("enviando msg pelo telegram");
        validarConectadoInternet();
    }

    @Override
    public void receberMensagem() {
        System.out.println("recebendo msg pelo telegram");
    }

    
}
