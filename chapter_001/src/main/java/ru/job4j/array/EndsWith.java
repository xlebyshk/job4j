package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int k = post.length-1;
        for (int index = word.length-1;k != 0;index--) {
            if (word[index] != post[k]){
                result=false;
                break;
            }
            k--;
        }
        return result;
    }
}
