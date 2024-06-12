package projetos.msnmessanger.src.apps;

public class MSNMessanger extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        System.out.println("enviando msg pelo MSN messanger");
        validarConectadoInternet();
        
    }

    @Override
    public void receberMensagem() {
        System.out.println("recebendo msg pelo MSN messanger");
    }


    
}
