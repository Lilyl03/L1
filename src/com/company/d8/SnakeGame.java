package com.company.d8;

import java.util.Scanner;

public class SnakeGame {
    public static void main(String[] args) {
        Snake snake = new Snake();
        snake.createBoard();
        char lastMove;
        while(true){
            snake.printBoard();
            char move = new Scanner(System.in).nextLine().charAt(0);
            snake.move(move);
            lastMove = move;
            snake.setLastMove(lastMove);
        }

    }
}
