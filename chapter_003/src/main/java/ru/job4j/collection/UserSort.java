package ru.job4j.collection;

public class UserSort implements Comparable<UserSort> {
    private String name;
    private Integer age;

    public UserSort(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(UserSort o) {
        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = this.age.compareTo(o.age);
        }
        return result;
    }
}
