package ru.job4j.collection;

import java.util.Comparator;

public class UserByName implements Comparator<UserSort> {
    @Override
    public int compare(UserSort o1, UserSort o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
