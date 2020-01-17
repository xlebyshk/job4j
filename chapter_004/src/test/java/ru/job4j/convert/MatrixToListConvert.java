package ru.job4j.convert;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class MatrixToListConvert {
    @Test
    public void convert() {
        MatrixToList mtl = new MatrixToList();
        Integer[][] matrix = {{85, 12}, {0, 0, 0, 0}, {10, 11}};
        List<Integer> result = mtl.convert(matrix);
        List<Integer> expect = List.of(85, 12, 0, 0, 0, 0, 10, 11);
        assertThat(result, is(expect));
    }
}
