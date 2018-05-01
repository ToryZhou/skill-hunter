package com.job.tokenbucket;

import org.junit.Test;

public class Tester {

    @Test
    public void test() {
        Producer producer = new Producer();
        producer.produce(5);
        testConsume();
        testConsumeExt();
    }

    private void testConsume() {
        Consumer consumer = new Consumer();
        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int tokenNumber = i % 3 + 1;
                Boolean consume = consumer.consume(tokenNumber);
                if (consume) {
                    System.out.println("Success testConsume: " + tokenNumber);
                    doSomething();
                } else {
                    System.out.println("No token testConsume");
                }
            }
        }).start();
    }

    private void testConsumeExt() {
        Consumer consumer = new Consumer();
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int tokenNumber = i * 2 % 3 + 1;
            Boolean consume = consumer.consume(tokenNumber);
            if (consume) {
                System.out.println("Success testConsume2: " + tokenNumber);
                doSomething();
            } else {
                System.out.println("No token testConsume2");
            }
        }
    }

    private void doSomething(){

    }
}
