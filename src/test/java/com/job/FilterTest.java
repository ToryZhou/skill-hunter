/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package com.job;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

/**
 * Author: Tory
 * Date: 4/18/18
 * Time: 12:48 PM
 */
public class FilterTest extends TestCase {

    // https://stackoverflow.com/questions/49892008/java8-way-to-handle-if-else-check-in-collections
    public void test() {
        List<String> fruits = Arrays.asList("Apple", "Orange", "Banana");
        List<String> animals = Arrays.asList("Tiger", "Lion", "Monkey");
        @SuppressWarnings("all")
        Map<String, List<String>> allLists = new HashMap() {{
            put("fruits", fruits);
            put("animals", animals);
        }};

        Consumer<List<String>> consumer1 = arg -> {
            Optional<Boolean> apple = Optional.of(arg.contains("Apple")).filter(value -> value.equals(true));
            if (apple.isPresent()) {
                System.out.println("Apple is available");
            } else {
                System.out.println("Apple is not Available");
            }
        };
        Optional.of(allLists.get("fruits")).ifPresent(consumer1);

        if (allLists.getOrDefault("fruits", Collections.emptyList()).contains("Apple")) {
            System.out.println("Having apples");
        }
    }


}
