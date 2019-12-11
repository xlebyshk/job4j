package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenFirstMax() {
        SqMax check = new SqMax();
        int result = check.max(5, 4, 2, 3);
        assertThat(result, is(5));
    }

    @Test
    public void whenSecondMax() {
        SqMax check = new SqMax();
        int result = check.max(3, 12, 1, 8);
        assertThat(result, is(12));
    }

    @Test
    public void whenThirdMax() {
        SqMax check = new SqMax();
        int result = check.max(1, 2, 4, 3);
        assertThat(result, is(4));
    }

    @Test
    public void whenForthMax() {
        SqMax check = new SqMax();
        int result = check.max(5, 4, 2, 43);
        assertThat(result, is(43));
    }

    @Test
    public void whenEqual() {
        SqMax check = new SqMax();
        int result = check.max(10, 10, 10, 10);
        assertThat(result, is(10));
    }
}