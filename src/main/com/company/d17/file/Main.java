package com.company.d17.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("C:\\Users\\LUser\\IdeaProjects\\L1\\src\\main\\com\\company\\d17\\file\\text.txt"));
            System.out.println(scanner.nextLine());
            System.out.println(scanner.nextLine());
            System.out.println(scanner.nextLine());
            System.out.println(scanner.nextLine());
        }catch (Exception e){

        }finally {
            scanner.close();
        }
    }

}