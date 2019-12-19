package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        int horizontal = 0;
        int vertical = 0;
        char sign = ' ';
        for (int row = 0; row < board.length; row++) {
            sign = board[row][row];
            if (sign == 'X') {
                for (int cell = 0; cell < board.length; cell++) {
                    sign = board[row][cell];
                    if (sign == 'X') {
                        horizontal++;
                    }
                    sign = board[cell][row];
                    if (sign == 'X') {
                        vertical++;
                    }
                }
                if (vertical == board.length || horizontal == board.length) {
                    result = true;
                    break;
                }
                break;
            }
        }
        return result;
    }
}