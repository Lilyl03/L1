package com.company.d22;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;


public class FileMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\LUser\\IdeaProjects\\L1\\src\\main\\com\\company\\d22\\file.txt");
//        fileOutputStream.write(0);
//        fileOutputStream.write(1);
//        fileOutputStream.close();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        final Address address = new Address();
        address.setCountry("Armenia");
        address.setNumber(54);
        objectOutputStream.writeInt(12345678);
        objectOutputStream.writeDouble(12345678);
        objectOutputStream.writeFloat(1234569);
        objectOutputStream.writeObject(address);
        objectOutputStream.close();
        fileOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\LUser\\IdeaProjects\\L1\\src\\main\\com\\company\\d22\\file.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        System.out.println(objectInputStream.readInt());
        System.out.println(objectInputStream.readDouble());
        System.out.println(objectInputStream.readFloat());
        System.out.println(objectInputStream.readObject());
        objectInputStream.close();
    }
}
