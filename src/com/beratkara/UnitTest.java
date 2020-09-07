package com.beratkara;

import junit.framework.*;

public class UnitTest extends TestCase {
    protected int a, b;
    protected String text, text2;

    public static Task task = new Task();

    // assigning the values

    protected void setUp(){
        a = 7;
        b = 10;
        text = "1234567890";
    }

    /**
     * Unique Map Test
     */
    public void testUniqueMap(){
        boolean result = task.isUnique(text);
        assertTrue(result);
    }

    /**
     * Unique Custom Test
     */
    public void testUniqueCustom(){
        boolean result = task.isUniqueCustom(text);
        assertTrue(result);
    }

    /**
     * Sum Test
     */
    public void testSum(){
        int result = task.sum(a,b);
        assertEquals(17, result);
    }

    /**
     * Logic Sum Test
     */
    public void testSumLogic(){
        int result = task.sumLogic(a,b);
        assertEquals(17, result);
    }
}
