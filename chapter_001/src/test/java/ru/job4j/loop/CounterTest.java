package ru.job4j.loop;

import org.hamcrest.Matchers;
import org.junit.Test;
import ru.job4j.condition.SqMax;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter check = new Counter();
        int result = check.add(1, 10);
        assertThat(result, Matchers.is(30));
    }
}
