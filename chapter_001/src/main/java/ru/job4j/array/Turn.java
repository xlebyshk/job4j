package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        int k = 0;
        int inL;
        int inF;
        for (int index = array.length-1;index > 1; index --) {
            inL = array[index];
            inF = array[k];
            array[k] = inL;
            array[index] = inF;
            k++;
        }
        return array;
    }
}