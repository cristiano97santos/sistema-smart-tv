package com.cristiano;


public class SmartTv{
    boolean ligada = false;
    int canal = 1;
    static int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;

    }

    public  void aumentarcanal() {
        canal ++;

    }
    public  void diminuircanal() {
        canal --;

    }


    public void ligar() {
        ligada =true;
    }
    public void desligar() {
        ligada =false;
    }

    public  void diminuirVolume() {
        volume --;
        System.out.println("Aumentando o volume para: " + volume);

    } public  void aumentarVolume() {
        volume ++;
        System.out.println("Diminuindo o volume para: " + volume);

    }
}