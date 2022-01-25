package com.company.d6.game;
public class Player {
    String name;
    String userName;
    Game[] games;

    public static void main(String[] args) {

    }
    public void print(){
        System.out.println("username: " + userName );
        for(int i = 0; i< games.length; i++) {
            System.out.println("game : " + i);
            games[i].print();
        }
    }
    public String getPrintString(){
        String s = "username: " + userName;
        s += "\n";
        for(int i = 0; i< games.length; i++) {
             s += "game : " + i;
             s += "\n";
            s += games[i].getPrintString();
            s += "\n";
        }
        return s;
    }
}
