package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        int inT;
        for (int index = 0;index < array.length / 2; index ++) {
            inT = array[index];
            array[index] = array[array.length-1 - index];
            array[array.length-1 - index] = inT;
        }
        return array;
    }
}