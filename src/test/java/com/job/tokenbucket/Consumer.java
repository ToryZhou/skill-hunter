package com.job.tokenbucket;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Consumer {

    /**
     * @param tokenNumber The number of the request need
     * @return true refer to pass, false refer to reject
     */
    public Boolean consume(int tokenNumber) {
        Bucket bucket = Bucket.getBucket();
        Set<Token> tokenSet = bucket.getTokenSet();

        if (tokenSet.size() > tokenNumber) {
            HashSet<Token> tokenConsumeSet = new HashSet<>();
            Iterator<Token> iterator = tokenSet.iterator();
            for (int i = 0; i < tokenNumber; i++) {
                tokenConsumeSet.add(iterator.next());
            }
            tokenSet.removeAll(tokenConsumeSet);
            return true;
        } else {
            return false;
        }
    }
}
