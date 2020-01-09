package ru.job4j.collection;

import java.util.Comparator;

public class UserDescByName implements Comparator<UserSort> {
    @Override
    public int compare(UserSort o1, UserSort o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
