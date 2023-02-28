public class Usuario {
    public static void main(String[] args) throws Exception {
    
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

    //Ligar/Desligar tv ----------------

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);
        //TV ligada

        smartTv.desligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);
        //TV desligada


    //Aumentar volume -------------------

        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        //volume aumentando

        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        //volume diminuindo


    //Mudar Canal  ----------------------

        smartTv.mudarCanal(10);
        System.out.println("Canal atual: " + smartTv.canal);
        //canal escolhido pelo usuário

        smartTv.aumentarCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        //canal aumenta em 1 número

        smartTv.diminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        //canal diminui em 1 número

    }
}
