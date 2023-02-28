public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

//Ligar tv -------------------------

    public void ligar (){
        ligada = true;
    }

    public void desligar (){
        ligada = false;
    }

//Aumentar Volume ------------------

    public void aumentarVolume (){
        //volume = volume +1
        volume++;
    }

    public void diminuirVolume (){
        volume--;
    }

//Mudar Canal -----------------------

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    //canal escolhido pelo usuário

    
}