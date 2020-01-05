package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] arrayCOINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int balance = money - price;
        for (int i = 0; i < arrayCOINS.length; i++) {
            while (balance - arrayCOINS[i] >= 0) {
                balance = balance - arrayCOINS[i];
                rsl[size++] = arrayCOINS[i];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
