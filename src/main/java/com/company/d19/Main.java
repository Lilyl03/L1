package com.company.d19;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>(1000);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
      //  System.out.println(list);
//        list.remove((Object)1);
//        System.out.println(list);
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        for (Integer integer: list) {
//            System.out.println(iterator.next());
//
//        }
//        while (iterator.hasNext()) {
//            if (iterator.next() == 4) {
//                iterator.remove();
//
//            }
//            for (Integer integer : list) {
//                System.out.println(integer);
//            }
//
//        }
        List<Integer> list = new LinkedList<>();
//        list.add(7);
//        list.add(14);
//        list.add(149);
//        list.add(14);
//        printAll(list);
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        printAll(list);
        List<Integer> list3 = Collections.emptyList();
        List<String> singletonList = Collections.singletonList("sddgdfg");
    }
    public static void printAll(List<Integer> list){
        Long start = System.currentTimeMillis();
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println(System.currentTimeMillis()-start);
    }
}
