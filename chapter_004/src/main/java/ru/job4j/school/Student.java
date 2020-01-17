package ru.job4j.school;

public class Student {
    private final int score;
    private String name;

    public Student(int score, String name) {
        this.score = score;
        this.name = name;
    }

    public Student(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
