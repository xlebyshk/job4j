package ru.job4j.collection;

import java.util.Comparator;

public class UserDescByAge implements Comparator<UserSort> {
    @Override
    public int compare(UserSort o1, UserSort o2) {
        return Integer.valueOf(o1.getAge()).compareTo(Integer.valueOf(o2.getAge()));
    }
}
