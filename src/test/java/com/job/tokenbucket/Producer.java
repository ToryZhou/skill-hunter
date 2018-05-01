package com.job.tokenbucket;

import com.job.common.util.UniqueString;

import java.util.Set;

public class Producer {
    /**
     * The produce thread will stop when nobody use the bucket numberPerSecond hours
     * @param numberPerSecond The number of token produced per second
     */
    public void produce(Integer numberPerSecond) {
        Bucket bucket = Bucket.getBucket();
        new Thread(() -> {
            Integer nobodyUseTimes = 0;
            while (nobodyUseTimes < 60 * 60 * numberPerSecond) {
                try {
                    Thread.sleep(1000 / numberPerSecond);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Token token = new Token();
                token.setValue(UniqueString.uuidUniqueString());
                Set<Token> tokenSet = bucket.getTokenSet();
                if (tokenSet.size() < bucket.getSize()) {
                    System.out.println("Adding token: " + tokenSet.size());
                    tokenSet.add(token);
                    nobodyUseTimes = 0;
                } else {
                    System.out.println("Full bucket");
                    nobodyUseTimes++;
                }
            }
        }).start();
        System.out.println("continue the main thread");

    }
}
