package com.company.d9.car;

public class AdvancedAudioPlayer extends AudioPlayer {
    //          SUB CLASS                SUPER CLASS
    public void pause() {
        System.out.println("Paused;");
    }

    public  AdvancedAudioPlayer(){
        super();
        System.out.println("Advanced Audio Player");
    }
    public static void main(String[] args) {
        new AdvancedAudioPlayer();
    }
    @Override
    public void play() {
        super.play();
    }
}
