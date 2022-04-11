package com.company.d25.Collection;


import java.util.*;
import java.util.concurrent.*;
import java.util.function.Consumer;

public class SynchCollectionMain {

    public static void main(String[] args) {
       // List<Integer> sharedList = Collections.synchronizedList(new LinkedList<>());
        List<Integer> sharedList = new CopyOnWriteArrayList<>();
        ExecutorService executor2 = Executors.newCachedThreadPool();
        List<Future<?>> future = new ArrayList<>();
//        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 150; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 15; j++) {
                        sharedList.add(new Random().nextInt());
                    }
                }
            };
//            Thread thread = new Thread(runnable);
//            thread.start();
//            threads.add(thread);
            Future<?> submit = executor2.submit(runnable);
            future.add(submit);
//            executor2.submit(new Callable<Object>() {
//                @Override
//                public Object call() throws Exception {
//                    return null;
//                }
//            });
        }
        future.forEach(future1 -> {
            try {
                future1.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
        executor2.shutdown();
//       threads.forEach(new Consumer<Thread>() {
//            @Override
//            public  void accept(Thread thread) {
//                try {
//                    thread.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//    });
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(sharedList.size());
//            }
//        }).start();
        System.out.println(sharedList.size());
    }
}
