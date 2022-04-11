package com.company.d6.game;

public class Game1 {
    String name;
    long shootCount;
    static long count;

    public static void main(String[] args) {
        Game1 game1 = new Game1();
        game1.name = "game 1";
        for(int i = 0 ; i <5; i++){
            long fire = game1.fire();
            game1.print();
//            System.out.println(game1.name + " " + "fire");
        }

        Game1 game2 = new Game1();
        game2.name = "game 2";
        for(int i = 0; i<125; i++){
            long fire = game2.fire();
            game2.print();
//            System.out.println(game2.name + " " + "fire");
        }
        System.out.println("count: " + count);

    }
    public long fire(){
        count++;
       // System.out.println(name + " " + "fire");
        return shootCount ++;
    }
    public void print(){
        System.out.println(name + " " + "fire: " + shootCount);
    }
}
