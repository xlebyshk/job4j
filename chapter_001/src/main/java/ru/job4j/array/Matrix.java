package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        int k = 1;
        int d = 1;
        for (int i = 0; i < size; i++) {
            for (int l = 0; l < size; l++) {
                table[i][l] = k * d;
                k++;
            }
            d++;
            k = 1;
        }
        return table;
    }
}