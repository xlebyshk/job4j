package ru.job4j.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FuctionCalculate {
    List<Double> diapason(int start, int finish, Function<Double, Double> op) {
        ArrayList<Double> result = new ArrayList<>();
        for (double index = start; index != finish; index++) {
            result.add(op.apply(index));
        }
        return result;
    }
}
