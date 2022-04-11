package com.company.d24.lambda;

import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("String1", "String2");
      //  list.forEach(s-> System.out.println(s));
        list.forEach(System.out::println);
       // Consumer<String> consumer = s -> System.out.println(s);
        //Consumer<String> consumer1 = System.out::println;

    }
}
