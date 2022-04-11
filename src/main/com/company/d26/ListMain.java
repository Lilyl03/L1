package com.company.d26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {
        List<String> list = List.of("a", "b");
        System.out.println(list.add("fgdh"));

        List<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        List<String> list1 = Collections.unmodifiableList(arrayList);


    }
}
