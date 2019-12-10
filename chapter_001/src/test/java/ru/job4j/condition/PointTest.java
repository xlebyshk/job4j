package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance(){
        int inX = 0;
        int inX2 = 0;
        int inY = 2;
        int inY2 = 0;
        double expected = 2;
        double out = Point.distance(inX, inX2, inY, inY2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
