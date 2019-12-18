package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        int row = 1;
        int cell = 1;
        for (int index = 0; index < size; index++) {
            for (int l = 0; l < size; l++) {
                table[index][l] = row * cell;
                row++;
            }
            cell++;
            row = 1;
        }
        return table;
    }
}