package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        int strSize1 = str1.length();
        int strSize2 = str2.length();
        int result = strSize1 - strSize2;

        int size = Math.min(strSize1, strSize2);

        for (int i = 0; i < size; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                result = Character.compare(str2.charAt(i), str1.charAt(i));
            }
        }
        return result;
    }
}

