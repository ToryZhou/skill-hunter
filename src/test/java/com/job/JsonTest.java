/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package com.job;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;

import junit.framework.TestCase;

import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.io.IOException;
import java.util.List;

import jdk.nashorn.internal.ir.annotations.Ignore;

/**
 * Author: Tory
 * Date: 4/17/18
 * Time: 7:01 PM
 */
@Ignore
public class JsonTest extends TestCase {

    public void test() throws IOException {
        // todo try to convert to object:  Convert Country Code To is latitude and longitude
        String original="{\"returnCode\":\"200\",\"message\":\"\",\"payload\":[{\"country_code\":\"SD\",\"Count\":\"2439401.0\"},{\"country_code\":\"KE\",\"Count\":\"701621.0\"}]}";
        ObjectMapper mapper = new ObjectMapper();
//        Result result = mapper.readValue(original, Result.class);
//        System.out.println(result.mesage);
    }

    public class Result{
        private String returnCode;
        private String mesage;
        private List<Payload> payload;


    }

    public class Payload{
        private String country_code;
        private String Count;
        private String latitude;
        private String longitude;

        public String getCountry_code() {
            return country_code;
        }

        public void setCountry_code(String country_code) {
            this.country_code = country_code;
        }

        public String getCount() {
            return Count;
        }

        public void setCount(String count) {
            Count = count;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }
    }
}
