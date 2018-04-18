/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package com.job;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

/**
 * Author: Tory
 * Date: 4/18/18
 * Time: 5:36 PM
 */
public class SecondBiggestTest extends TestCase {

    // https://stackoverflow.com/questions/49896115/casting-iterator-to-integer-concurrentmodificationexception/49897017#49897017
    public void test() {
        List<Integer> integers = Arrays.asList(1, 4, 1234, 5, 6, 77);
        int secondBiggest = second(integers, -1, 0, 0);
        System.out.println(secondBiggest);
    }


    private Integer second(List<Integer> a, Integer biggest, Integer secondBiggest, Integer length) {
        if (a.size() > length) {
            Integer cur = a.get(length);
            length++;
            if (cur > biggest) {
                secondBiggest = biggest;
                biggest = cur;
            } else if (cur < biggest && cur > secondBiggest) {
                secondBiggest = cur;
            }
            secondBiggest = second(a, biggest, secondBiggest, length);
        }
        return secondBiggest;
    }

    private void str(){
        String str = "te\\\"st\"";
    }

}
