package com.zcy;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest{
    @Test
    public void testSay(){
        Demo demo = new Demo();
        String ret = demo.say("zhu");
        Assert.assertEquals("hello zhu",ret);
    }
}
