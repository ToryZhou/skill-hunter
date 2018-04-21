/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package com.job;

import java.util.Scanner;

/**
 * Author: Tory
 * Date: 4/21/18
 * Time: 9:30 PM
 */
public class InputTest {

//    public static void main(String[] args) {
//        System.out.println("enter something");
//        boolean matches;
//        Scanner keyboard = new Scanner(System.in);
//        int num = 0;
//        do {
//            String line = keyboard.nextLine();
//            matches = line.matches("^\\d$");
//            if(matches){
//                num = Integer.parseInt(line);
//            }else{
//                System.out.println("Please enter an integer");
//            }
//
//        } while (!matches);
//        System.out.println(num);
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an int: ");
        String s = sc.next();
        while (!s.matches("\\d+")) {
            System.out.println("Input is not valid! Re enter an integer!");
            System.out.print("Please enter an int: ");
            s = sc.next();
        }
        int numWeight = Integer.parseInt(s);
        System.out.println("Int: " + numWeight);
    }
}
