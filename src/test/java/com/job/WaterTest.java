/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package com.job;

import org.junit.Assert;
import org.junit.Test;

/**
 * Author: Tory
 * Date: 4/26/18
 * Time: 3:11 PM
 */
public class WaterTest {

    //    设计模式，水滴，  并发对象池，解析文件，    并发请求，令牌桶算法
    @Test
    public void test() {
        int[] arr = {1, 0, 3, 0, 1, 1, 0, 1, 1};
        int sum = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            int leftBiggest = leftBiggest(arr, i);
            int rightBiggest = rightBiggest(arr, i);
            sum += calc(leftBiggest, arr[i], rightBiggest);
        }
        Assert.assertEquals(3, sum);
    }

    private int calc(int a, int b, int c) {
        if (b < a && b < c) {
            return smaller(a - b, c - b);
        } else {
            return 0;
        }
    }

    private int smaller(int a, int b) {
        return a > b ? b : a;
    }

    private int leftBiggest(int[] arr, int index) {
        int biggest = 0;
        for (int i = 0; i < index; i++) {
            if (arr[i] > biggest) {
                biggest = arr[i];
            }
        }
        return biggest;
    }

    private int rightBiggest(int[] arr, int index) {
        int biggest = 0;
        for (int i = index; i < arr.length; i++) {
            if (arr[i] > biggest) {
                biggest = arr[i];
            }
        }
        return biggest;
    }

}
