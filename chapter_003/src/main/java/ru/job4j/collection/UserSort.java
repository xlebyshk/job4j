package ru.job4j.collection;

import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserSort user = (UserSort) o;
        return age == user.age
                && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
