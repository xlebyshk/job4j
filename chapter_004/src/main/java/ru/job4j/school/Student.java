package ru.job4j.school;

public class Student implements Comparable<Student> {

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

    @Override
    public int compareTo(Student o) {
        return Integer.compare(o.getScore(), this.score);
    }
}
