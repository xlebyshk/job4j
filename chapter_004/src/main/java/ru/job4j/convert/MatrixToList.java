package ru.job4j.convert;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MatrixToList {
    public List<Integer> convert(Integer[][] matrix) {
        List<Integer> rsl = Arrays.stream(matrix).flatMap(Arrays::stream).collect(Collectors.toList());
        return rsl;
    }
}
