package projetos.iphone.src;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    
    // metodos do aparelho telefonico
    @Override
    public void ligar(){
        System.out.println("Realizando chamada...");
    }

    @Override
    public void atender() {
        System.out.println("Atentendo chamado");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de voz");
    }

    // metodos NavegadorInternet
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina do navegador");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionado uma nova aba ao navegador");
    }

    @Override
    public void adicionarPagina() {
        System.out.println("Adicionando uma nova pagina ao navegador");
    }

    // metodos ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando musica no reprodutor");
    }

    @Override
    public void pausar() {
       System.out.println("Pausando musica no reprodutor");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica no reproduto");
    }


    public static void main(String[] args) {
        
        Iphone meuIphone = new Iphone();

        meuIphone.atender();
        meuIphone.adicionarPagina();


        
    }

}



