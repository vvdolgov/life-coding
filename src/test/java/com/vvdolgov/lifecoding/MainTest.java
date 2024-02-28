package com.vvdolgov.lifecoding;


import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void testMain(){
        LifeCodingMain.main(new String[]{});
        Assert.assertTrue(true);
    }
}
