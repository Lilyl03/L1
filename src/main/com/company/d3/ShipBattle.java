package com.company.d3;

import java.util.Scanner;

public class ShipBattle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] board = {
                {" "," ", " "," "," "," "," "," "," "," "},
                {" "," ", " "," "," "," "," "," "," "," "},
                {" "," ", " "," "," "," "," "," "," "," "},
                {" "," ", " "," "," "," "," "," "," "," "},
                {" "," ", " "," "," "," "," "," "," "," "},
                {" "," ", " "," "," "," "," "," "," "," "},
                {" "," ", " "," "," "," "," "," "," "," "},
                {" "," ", " "," "," "," "," "," "," "," "},
                {" "," ", " "," "," "," "," "," "," "," "},
                {" "," ", " "," "," "," "," "," "," "," "},
        };
        System.out.println("Please input the coordinates of the 6 block ship");
        int startCoord = input.nextInt();
        if((startCoord >= 11 && startCoord <= 99)){

        }else if((startCoord >=101 && startCoord<=109)){

        }else if(startCoord >=110 && startCoord <=910){

        }
    }
}

