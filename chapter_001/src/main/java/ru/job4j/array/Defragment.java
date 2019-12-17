package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            if (cell == null) {
                int cellNext = index + 1;
                while (array[index] == null && cellNext < array.length) {
                    array[index] = array[cellNext];
                    array[cellNext] = null;
                    cellNext++;
                }
            }
        }
        return array;
    }
}
