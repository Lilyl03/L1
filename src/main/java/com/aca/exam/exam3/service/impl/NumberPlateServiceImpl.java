package com.aca.exam.exam3.service.impl;

import com.aca.exam.exam3.service.core.NumberPlateService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class NumberPlateServiceImpl implements NumberPlateService {
    private static char[] arrayForX = {'A', 'B', 'C'};
    private static Set<String> plateNumbers= new HashSet<>();
    private Connection connection;

    private static void executorMonitoring(Runnable runnable, int[] i ) {
        Executor executor = Executors.newFixedThreadPool(9000);
        executor.execute(runnable);
        }

    private static  String createPlateNumber(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            int intForX = new Random().nextInt(3);
            stringBuilder.append(arrayForX[i]);
        }
        for (int i = 0; i < 3; i++) {
            int intForY = new Random().nextInt(10);
            stringBuilder.append(intForY);
        }
        return stringBuilder.toString();
    }

    private static void createPlates(){
        final int[] i = {0};
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String plateNumber = createPlateNumber();
                if (!plateNumbers.contains(plateNumber)) {
                    plateNumbers.add(plateNumber);
                }else{
                    i[0]--;
                }
            }
        };
        executorMonitoring(runnable,i);

    }

    @Override
    public Set<String> create() throws SQLException {
        createPlates();
        for (String plateNumber : plateNumbers) {
            connection.createStatement().execute("insert into numberplates(number_plate) values( %s );");
        }

        return plateNumbers;
    }


}
