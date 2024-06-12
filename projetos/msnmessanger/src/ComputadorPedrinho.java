package projetos.msnmessanger.src;

import projetos.msnmessanger.src.apps.FacebookMessanger;
import projetos.msnmessanger.src.apps.MSNMessanger;
import projetos.msnmessanger.src.apps.ServicoMensagemInstantanea;
import projetos.msnmessanger.src.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args){

        ServicoMensagemInstantanea smi = null;
        // nao se saber qual app, mas qualquer um
        // devera enviar e receber msg

        String appEscolhido = "tlg";

        switch (appEscolhido) {
            case "msn" -> smi = new MSNMessanger();
            case "fbm" -> smi = new FacebookMessanger();
            case "tlg" -> smi = new Telegram();
            default -> {
            }
        }

        smi.enviarMensagem();
        smi.receberMensagem();




    }

 }
