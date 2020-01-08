package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = false;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> orig = new HashSet<>();
        HashSet<String> check = new HashSet<>();
        for (String value : origin) {
            orig.add(value);
        }
        for (String value : text) {
            check.add(value);
        }
        for (String value : orig) {
            rsl = check.contains(value);
        }
        return rsl;
    }
}
