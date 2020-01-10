package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To2And3Then1() {
        int result = Max.max(3, 2, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax6To9And10And23Then2() {
        int result = Max.max(6, 9, 23, 10);
        assertThat(result, is(23));
    }

    @Test
    public void whenMax1To4Then4() {
        int result = Max.max(1, Max.max(2, 4));
        assertThat(result, is(4));
    }
}
