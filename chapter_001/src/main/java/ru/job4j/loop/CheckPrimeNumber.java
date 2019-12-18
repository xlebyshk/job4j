package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int finish) {
        boolean prime = false;
        int even = 0;
        for (int i = 1; i <= finish; i++) {
            if (finish % i == 0) {
                even++;
            }
        }
        if (even == 2) {
            prime = true;
        }
        return prime;
    }
}