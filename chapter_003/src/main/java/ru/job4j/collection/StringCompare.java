package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int rsl = left.length() - right.length();
        int size = Math.min(left.length(), right.length());

        for (int i = 0; i < size; i++) {
            int compare = Character.compare(left.charAt(i), right.charAt(i));

            if (compare != 0) {
                rsl = compare;
            }
        }
        return rsl;
    }
}
