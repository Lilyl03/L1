package com.company.d6.game;

public class Game {
    String name;
    long shootCount;
    static long shootCountOfClass;

    public static void main(String[] args) {
        shootCountOfClass++;
        shootCountOfClass++;
        shootCountOfClass++;
        shootCountOfClass++;
        Game game1 = new Game();
        game1.name = "game 1";
        game1.shootCount++;
        game1.shootCount++;
        game1.shootCount++;

        Game game2 = new Game();
        game2.name = "game 2";
        game2.shootCount++;

        Game game3 = new Game();
        game3.name = "game 3";
//
//        System.out.println(game1.shootCount);
//        System.out.println(game2.shootCount);
//        System.out.println(game3.shootCount);
        game1.printShootCount();
        game2.printShootCount();
        game3.printShootCount();
    }
    public void printShootCount(){
        System.out.println(shootCount);
    }
    public void printShootCountForClass(){
        System.out.println(shootCount);
    }
}
