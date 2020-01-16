package ru.job4j.calculator;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FuctionCalculateTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        FuctionCalculate function = new FuctionCalculate();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        FuctionCalculate function = new FuctionCalculate();
        List<Double> result = function.diapason(5, 8, x -> x * x);
        List<Double> expected = Arrays.asList(25D, 36D, 49D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLogFunctionThenLogResults() {
        FuctionCalculate function = new FuctionCalculate();
        List<Double> result = function.diapason(1, 2, x -> Math.log(x));
        List<Double> expected = Arrays.asList(0D);
        assertThat(result, is(expected));
    }
}
