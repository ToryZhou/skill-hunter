/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package com.job;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Author: Tory
 * Date: 4/18/18
 * Time: 12:48 PM
 */
public class LinkedListTest extends TestCase {

    public void test() {
        List<String> strArrayList = new ArrayList<String>();
        long start2 = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            strArrayList.add("strArrayList Test"+i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("ArrayList Time in millis: " + (end2-start2));

        List<String> strLnkdList = new LinkedList<String>();
        long start1 = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            strLnkdList.add("strLnkdList Test"+i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("LinkedList Time in millis: " + (end1-start1));
    }
}
