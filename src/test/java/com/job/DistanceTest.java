/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package com.job;

import junit.framework.TestCase;

/**
 * Author: Tory
 * Date: 4/21/18
 * Time: 6:33 PM
 */
public class DistanceTest extends TestCase{


    public void test(){
        int distance = distance(1, 4);
        System.out.println(distance);
    }

    private static int distance(final int x, final int y) {
        if (x < y) {
            return y - x;
        }
        return x - y;
    }
}
