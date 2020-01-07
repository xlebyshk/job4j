package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] value : list) {
            for (int i = 0; i < value.length; i++) {
                rsl.add(value[i]);
            }
        }
        return rsl;
    }
}
