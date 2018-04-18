/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package com.job;

import junit.framework.TestCase;

import entity.Dog;

/**
 * Author: Tory
 * Date: 4/18/18
 * Time: 3:53 PM
 */
public class BuilderTest extends TestCase{


    public void test(){
        Dog dog = Dog.DogBuilder.aDog().withActive("a").build();
    }

}
