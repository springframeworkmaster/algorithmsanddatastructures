package com.tasks.advanced.algorithms;

import org.junit.Assert;
import org.junit.Test;

import com.tasks.advanced.algorithms.rabinkarp.RabinKarp;

public class FirstTest {

    @Test
    public void myFirstTest() {
        Assert.assertEquals("a","a");
    }


    @Test
    public void calculateHashTest() {
        RabinKarp k = new RabinKarp();
        Assert.assertEquals(3, k.search("acbacc".toCharArray(), "acc".toCharArray()));
        Assert.assertEquals(4, k.search("learning".toCharArray(), "nin".toCharArray()));
        Assert.assertEquals(-1, k.search("learning".toCharArray(), "nina".toCharArray()));
        Assert.assertEquals(0, k.search("learning".toCharArray(), "le".toCharArray()));
        Assert.assertEquals(0, k.search("learning".toCharArray(), "l".toCharArray()));
        Assert.assertEquals(5, k.search("learning".toCharArray(), "ing".toCharArray()));
        Assert.assertEquals(5, k.search("learning".toCharArray(), "in".toCharArray()));
        Assert.assertEquals(6, k.search("learning".toCharArray(), "ng".toCharArray()));
        Assert.assertEquals(7, k.search("learning".toCharArray(), "g".toCharArray()));
        Assert.assertEquals(28L, k.calculateHash("acbacc".toCharArray(), 3));
        Assert.assertEquals(18L, k.recalculateHash(28, 'a', 'a', 3));
    }

}
