package com.company.d8.snake;

import java.util.Random;

public class Snake {
    private int size = 1;
    private final char[][] board = new char[8][8];
    private final int[] position = new int[2];
    private char lastMove1;
    private char lastMove2;

    public void setLastMove(char lastMove) {
        if(lastMove == 'd' || lastMove == 'a'){
            this.lastMove1 = lastMove;
        }else{
            this.lastMove2 = lastMove;
        }
    }

    public char[][] createBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '0';
            }
        }
        board[0][0] = '*';
        board[2][1] = '=';
        return board;
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[] first() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '*') {
                    position[0] = i;
                    position[1] = j;
                    return position;
                }
            }
        }
        return position;
    }

    public int[] last() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '*') {
                    position[0] = i;
                    position[1] = j;
                }
            }
        }
        return position;
    }


    private char[][] placeApple() {
        size++;
        int position1,position2;
        do{
            position1 = new Random().nextInt(7);
            position2 = new Random().nextInt(7);
            board[position1][position2] = '=';
            break;
        }while (board[position1][position2] != '0');
        return board;
    }

    public void move(char move) {
        switch (move) {
            case 'w':
                moveUp();
                break;
            case 's':
                moveDown();
                break;
            case 'd':
                moveRight();
                break;
            case 'a':
                moveLeft();
                break;
        }
    }

    private char[][] moveUp() {
        if(lastMove1 == 'd'){
            last();
            if (board[position[0] - 1][position[1]] == '=') {
                placeApple();
                board[position[0] - 1][position[1]] = '*';
                board[position[0] - 2][position[1]] = '*';
                first();
                board[position[0]][position[1]] = '0';
            } else {
                board[position[0] - 1][position[1]] = '*';
                first();
                board[position[0]][position[1]] = '0';
            }
        }else {
            first();
            if (board[position[0] - 1][position[1]] == '=') {
                placeApple();
                board[position[0] - 1][position[1]] = '*';
                board[position[0] - 2][position[1]] = '*';
                last();
                board[position[0]][position[1]] = '0';
            } else {
                board[position[0] - 1][position[1]] = '*';
                last();
                board[position[0]][position[1]] = '0';
            }
        }
        return new char[0][];
    }

    private char[][] moveRight () {
        last();
        if (board[position[0]][position[1] + 1] == '=') {
            placeApple();
            board[position[0]][position[1] + 1] = '*';
            board[position[0]][position[1] + 2] = '*';
            first();
            board[position[0]][position[1]] = '0';
        } else {
            board[position[0]][position[1] + 1] = '*';
            first();
            board[position[0]][position[1]] = '0';
        }
        return new char[0][];
    }

    private char[][] moveLeft() {
        first();
        if (board[position[0]][position[1] - 1] == '=') {
            placeApple();
            board[position[0]][position[1] - 1] = '*';
            board[position[0]][position[1] - 2] = '*';
            last();
            board[position[0]][position[1]] = '0';
        } else {
            board[position[0]][position[1] - 1] = '*';
            last();
            board[position[0]][position[1]] = '0';
        }
        return new char[0][];
    }

    private char[][] moveDown () {
        if (lastMove1 == 'd') {
            last();
            if (board[position[0] + 1][position[1]] == '=') {
                placeApple();
                board[position[0] + 1][position[1]] = '*';
                board[position[0] + 2][position[1]] = '*';
                first();
                board[position[0]][position[1]] = '0';
            } else {
                board[position[0] + 1][position[1]] = '*';
                first();
                board[position[0]][position[1]] = '0';
            }
        } else if (lastMove1 == 'a') {
            if (board[position[0] + 1][position[1]] == '=') {
                first();
                placeApple();
                board[position[0] + 1][position[1]] = '*';
                board[position[0] + 2][position[1]] = '*';
                last();
                board[position[0]][position[1]] = '0';
            } else {
                last();
                board[position[0]][position[1]] = '0';
                first();
                board[position[0] + 1][position[1]] = '*';

            }}else{
                last();
                if (board[position[0] + 1][position[1]] == '=') {
                    placeApple();
                    board[position[0] + 1][position[1]] = '*';
                    board[position[0] + 2][position[1]] = '*';
                    last();
                    board[position[0]][position[1]] = '0';
                } else {
                    board[position[0] + 1][position[1]] = '*';
                    first();
                    board[position[0]][position[1]] = '0';
                }
            }
        return new char[0][];
    }
}
