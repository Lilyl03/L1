package com.company.d4;

import java.util.Scanner;

public class ShipBattle {
    public static void main(String[] args) {
        char[][] fields = new char[5][5];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<5; i++){
            for(int j = 0; j<5;j++){
                fields[i][j] = '0';
            }
        }
        System.out.println("Before");
        printMatrix(fields);
        addShip1(fields,3,1);
        System.out.println("After");
        printMatrix(fields);
    }
    public static char[][] addShip(char[][] fields, int i, int j){
        if(j +4 >= fields[i].length){
            return fields;
        }
        for(int c = j; c < j+4; c++){
            fields[i][c] = '*';
        }
        return  fields;
    }
    public static void printMatrix(char[][] matrix){
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j< matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static char[][] addShip1(char[][] fields, int i, int j){
        for(int c = j+1; c>0;c--){
            fields[i][c] = '*';

        }
        for(int c = i-1; c<i;c++){
            fields[c][j] = '*';
        }

        return fields;
    }
}
