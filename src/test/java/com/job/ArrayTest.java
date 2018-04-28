/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package com.job;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Author: Tory
 * Date: 4/28/18
 * Time: 8:13 PM
 */
public class ArrayTest {

    @Test
    public void test() {
        int[] counts = new int[]{1, 2, 3, 4};
        String[] s = {"a", "b"};
        List<String> strings = Arrays.asList(s);
        List<Integer> list = IntStream.of(counts).boxed().collect(Collectors.toList());
    }
}
