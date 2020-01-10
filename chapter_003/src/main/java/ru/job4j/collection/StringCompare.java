package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl;
        int size;
        int leftC = 0;
        int rightC = 0;

        if (left.equals(right)) {
            return 0;
        }

        if (left.length() >= right.length()) {
            size = right.length();
        } else {
            size = left.length();
        }
        for (int i = 0; i < size; i++) {
            if (Character.compare(left.charAt(i), right.charAt(i)) > 0) {
                leftC++;
            } else if (Character.compare(left.charAt(i), right.charAt(i)) < 0) {
                rightC++;
            }
        }
        rsl = Integer.compare(leftC, rightC);
        return rsl;
    }
}
