package projetos.msnmessanger.src;

public class FacebookMessanger extends ServicoMensagemInstantanea{

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo msg pelo facebook messanger");
    }

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando msg pelo facebook messanger");
    }
}
