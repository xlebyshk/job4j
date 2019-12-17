package ru.job4j.loop;

public class Mortgage {
    public int year(double amount, int salary, double percent) {
        //изменил тип int на double у переменной amount т.к. переменная percent типа double и все выражения надо было привести к этому типу
        int year = 0;
        while (amount > 0) {
            amount = (amount + ((amount / 100) * percent)) - salary;
            year++;
        }
        return year;
    }
}