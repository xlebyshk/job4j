package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int finish) {
        boolean prime = false;
        int l=0;
        for (int i = 1;i<=finish;i++){
            if(finish % i == 0){
                l++;
            }
        }
        if (l==2){
            prime=true;
        }
        return prime;
    }
}