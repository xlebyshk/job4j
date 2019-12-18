package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        int value = 1;
        for (int index = 0; index != bound; index++) {
            rst[index] = value * value;
            value++;
        }
        return rst;
    }
}
