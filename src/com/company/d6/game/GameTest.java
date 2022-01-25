package com.company.d6.game;

public class GameTest {
    public static void main(String[] args) {
        Game game1 = new Game();
        game1.name = "game 1";
        Game game2 = new Game();
        game2.name = "game 2";
        Game[] gameArray = {game1,game2};
        Player player1 = new Player();
        player1.userName =  "aca";
        player1.games = gameArray;
        //player1.print();
        System.out.println(player1.getPrintString());
    }
}
