package com.company.d25;

import com.company.d25.Printer.Printer;
import com.company.d25.Printer.TextPrinterRunnable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TextPrinterRunnableTest {
    private TextPrinterRunnable testSubject;

//    @BeforeEach
//    public void init(){
//        testSubject = new TextPrinterRunnable(new Printer() {
//            @Override
//            public void print(String text) {
//                System.out.println(text);
//            }
//        }, "Hello World");
//    }

    @Test
    public void testRun(){
        final int[] invokateCount = {0};
        testSubject = new TextPrinterRunnable(new Printer() {
            @Override
            public void print(String text) {
                invokateCount[0]++;
                Assertions.assertEquals("Hello World", text);
            }
        },"Hello World");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                testSubject.stop();
            }
        }).start();
        testSubject.run();
        Assertions.assertEquals(1, invokateCount);
    }
}