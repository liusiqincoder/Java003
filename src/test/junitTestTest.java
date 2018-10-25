package test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/10/3.
 */
public class junitTestTest {
    junitTest t = new junitTest();

    @org.junit.Test
    public void testSay() throws Exception {
        assertEquals(t.say("哈哈"), "在测试方法中。。。sxase");
    }
}