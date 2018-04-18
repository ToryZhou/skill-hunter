/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package com.job;


import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Author: Tory
 * Date: 4/17/18
 * Time: 7:01 PM
 */
public class ContainTest extends TestCase {

    // Answer for https://stackoverflow.com/questions/49889507/loop-through-objects-fields/49890286#49890286

    public void test() {
        String sentence = "abcabc";
        String word = "ab";
        int count = count(sentence, word, 0);
        Assert.assertEquals(count, 2);
    }

    private int count(String sentence, String word, int times) {
        if (sentence.contains(word)) {
            times++;
            int i = sentence.indexOf(word);
            String substring = sentence.substring(i + word.length());
            times = count(substring, word, times);
        }
        return times;
    }


}
