package ru.job4j.collection;

import java.util.Iterator;
import java.util.List;

public class ConvertList2Array {

    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0, cell = 0;
        for (Integer num : list) {
            if (groups <= cell) {
                row++;
                cell = 0;
            }
            array[row][cell++] = num;
        }
        return array;
    }
}
