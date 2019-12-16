package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        int min = MinDiapason.findMin(data, 0, data.length);
        int index = FindLoop.indexOf(data, min, 0, data.length);
        int temp = 0;
        for (;index < data.length; index++) {
            min = index;
            for (int k = index + 1; k < data.length; k++) {
                if (data[k] < data[min]) {
                    min = k;
                }
            }
            temp = data[min];
            data[min] = data[index];
            data[index] = temp;
        }

        return data;
    }
}