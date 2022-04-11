package com.company.d9.car;

public class Market {
    private static int sold;
    public static int soldCar(){
        return sold++;
    }
    public static Car carOption1() {
        Car car = new Car();
        car.setAudioPlayer(new AudioPlayer());
        soldCar();
        return car;
    }

    public static Car carOption2() {
        Car car = new Car();
        soldCar();
        return car;

    }

    public static void main(String[] args) {
        Car carOption1 =carOption1();
        carOption1.openDoor();
        carOption1.closeDoor();
        Car carOption2 = carOption2();
        carOption2.openDoor();
        carOption2.closeDoor();
        System.out.println(soldCar());
    }
}
