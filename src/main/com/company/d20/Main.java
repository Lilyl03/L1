package com.company.d20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    //    public static void main(String[] args) {
//        Runnable mulRunnable = new MulRunnable(123,456);
//        Runnable subRunnable = new SubtractRunnable(123,456);
//        Runnable sumRunnable = new SumRunnable(123,456);
//
//        List<Runnable> list = new ArrayList<>();
//        list.add(mulRunnable);
//        list.add(subRunnable);
//        list.add(sumRunnable);
//
//        mutate(list);
//        runRunnable(list);
//    }
//
//    public static void mutate(List<Runnable> runnableList){
//        runnableList.remove(0);
//    }
//
//    public static void runRunnable(List<Runnable> runnableList){
//        for (Runnable runnable : runnableList) {
//            runnable.run();
//        }
//    }
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(32,0.75f);
        map.put("Dell",2000);

        System.out.println(map.get("Dell").hashCode());
    }
}
