/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package com.job;

import junit.framework.TestCase;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Author: Tory
 * Date: 4/18/18
 * Time: 2:19 PM
 */
public class FileTest extends TestCase{

    public void test() throws IOException {
        getNames();
    }

    public Set<String> getNames() throws IOException {
        BufferedReader br;
        FileInputStream inputStream = new FileInputStream("src/test/resources/test.txt");
        br = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        List<String> fileStrings = new ArrayList<>();
        while ((line = br.readLine()) != null){
            fileStrings.add(line);
        }
        List<String> names = Arrays.asList("Pillow", "Sky");

        return fileStrings.stream().filter(names::contains).collect(Collectors.toSet());
    }

}
