package com.company.d9.car;

public class Car {
    private AudioPlayer audioPlayer;

    public Car() {

    }

    public Car(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(new AudioPlayer());
        Car car3 = new Car(null);

    }

    public void openDoor() {
        if (audioPlayer != null) {
            audioPlayer.play();
            wait3Seconds();
            audioPlayer.stop();
        } else {
            System.out.println("Has no audio player");
        }
    }

    public void wait3Seconds() {
        long start = System.currentTimeMillis();
        while (true) {
            long current = System.currentTimeMillis();
            if (current - start == 3000) {
                break;
            }
        }
    }

    public void closeDoor() {
        if (audioPlayer != null) {
            audioPlayer.stop();
        } else {
            System.out.println("Has no audio player");
        }
    }

    public void setAudioPlayer(AudioPlayer play) {
        this.audioPlayer = play;
    }

}
