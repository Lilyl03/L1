package com.company.d9.car;

public class AudioPlayer {
    private boolean isPlaying;
    public AudioPlayer(){
        super();
        System.out.println("Audio Player");
    }
    public void play() {
        isPlaying = true;
        System.out.println("Playing......");
    }

    public void stop() {
        isPlaying = false;
        System.out.println("Stopped!");
    }

    public boolean setPlaying(boolean isPlaying) {
        return this.isPlaying = isPlaying;
    }
}
