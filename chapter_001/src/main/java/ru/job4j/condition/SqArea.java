package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        int width = 1;
        int lenght = width * k;
        int b = width + lenght;
        int a = p / 2;
        width = a / b;
        lenght = width * k;
        return width * lenght;
    }

    public static void main(String[] args) {
        double result = square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result);
        double result1 = square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        double result2 = square(96, 5);
        System.out.println(" p = 96, k = 5, s = 320, real = " + result2);
        double result3 = square(256, 7);
        System.out.println(" p = 256, k = 7, s = 1792, real = " + result3);
    }
}