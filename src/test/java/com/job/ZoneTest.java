/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package com.job;

import junit.framework.TestCase;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Author: Tory
 * Date: 4/18/18
 * Time: 4:34 PM
 */
public class ZoneTest extends TestCase {
    public void test() {
        LocalTime localTime = LocalTime.of(9, 0, 0);
        LocalDate localDate = LocalDate.of(2017, Month.JUNE, 3);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("LocalDateTime:" + localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("GMT"));
        System.out.println("ZonedDateTime: " + zonedDateTime);

        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(localDateTime, ZoneId.of("Europe/London"));
        System.out.println("ZonedDateTime London: " + zonedDateTime2);

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId.getId());

        Instant currentTime = Instant.now();
        System.out.println(currentTime.toString());


    }
}
