package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int i = post.length - 1;
        for (int index = word.length - 1; i != 0; index--) {
            if (word[index] != post[i]) {
                result = false;
                break;
            }
            i--;
        }
        return result;
    }
}
