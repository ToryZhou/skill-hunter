package com.job;

import org.junit.Assert;
import org.junit.Test;

public class StringTest {

    @Test
    public void test() {
        String y = "y";
        String s = y;
        String ss = s;
        String t = y;
        y = "yy";
        s = "s";
        Assert.assertEquals("yy", y);
        Assert.assertEquals("s", s);
        Assert.assertEquals("y", ss);
        Assert.assertEquals("y", t);
        //结论 String 所有操作都是值传递，是特殊的引用对象。在这个测试中没有发生引用现象
    }
}
