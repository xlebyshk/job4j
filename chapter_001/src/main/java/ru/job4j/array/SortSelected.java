package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        int temp = 0;
        for (int i = 0; i < data.length - 1; i++) {
            int min = MinDiapason.findMin(data, i, data.length);
            int index = FindLoop.indexOf(data, min, i, data.length);
            temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }
        return data;
    }
}