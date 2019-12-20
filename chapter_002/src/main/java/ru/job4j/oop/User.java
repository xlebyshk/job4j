package ru.job4j.oop;

public class User {
    private String name; // поле объекта.Объявляется в теле класса
    private int age; // поле объекта.Объявляется в теле класса

    public boolean canDrive() {
        boolean can = false; // локальная переменная объявляется внутри метода
        if (age >= 18) {
            can = true;
        }
        return can;
    }
}
