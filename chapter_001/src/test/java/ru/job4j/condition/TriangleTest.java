package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 8);
        Point c = new Point(8, 12);
        Triangle triangle = new Triangle(a, b, c);
        double expected = 32;
        double out = triangle.area();
        Assert.assertEquals(expected, out, 0.01);
    }
}
