package projetos.msnmessanger.src;

public class MSNMessanger extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        System.out.println("enviando msg pelo MSN messanger");

        validarConectadoInternet();
        salvarHistoricoMensagem();
        
    }

    @Override
    public void receberMensagem() {
        System.out.println("recebendo msg pelo MSN messanger");
    }

    private  void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o historico de mensagem");
    }

    
}
