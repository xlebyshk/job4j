package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int x2, int y1, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = distance(10, 15, 2, 1);
        System.out.println("result1 (10, 15) to (2, 1) " + result1);
        double result2 = distance(25, 5, 8, 78);
        System.out.println("result2 (25, 5) to (8, 78) " + result2);
    }
}
