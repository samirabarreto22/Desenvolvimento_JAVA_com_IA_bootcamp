public class Usuario {
    public static void main(String[] args) throws  Exception{

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("canal: " + smartTv.canal);
        smartTv.mudarCanal(13);


        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.ligar();

        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

    }
}
