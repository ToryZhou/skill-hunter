package com.job.tokenbucket;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author Tory
 * 2018-05-02
 */
@Data
public class Bucket {

    private Integer size = 100;
    private String name;
    private Set<Token> tokenSet = new HashSet<>();

    private static Bucket bucket = new Bucket();

    private Bucket() {
    }

    static Bucket getBucket() {
        return bucket;
    }

}
