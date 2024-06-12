package projetos.msnmessanger.src.apps;

public abstract class ServicoMensagemInstantanea{
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    // somente os filhos conhecem este metodo
    protected void validarConectadoInternet(){
        System.out.println("Validando se esta conectado a internet");
    }
    
}
