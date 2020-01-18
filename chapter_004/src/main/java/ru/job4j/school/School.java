package ru.job4j.school;

import ru.job4j.stream.Address;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class School {

    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        List<Student> rsl = students.stream().filter(
                predict
        ).collect(Collectors.toList());
        return rsl;
    }

    public Map<String, Student> convertToMap(List<Student> students) {
        Map<String, Student> rsl = students.stream().collect(
                Collectors.toMap(Student::getName, e -> e)
        );
        return rsl;
    }

    public List<Student> levelOf(List<Student> students, int bound) {
        List<Student> rsl = students.stream().sorted().flatMap(Stream::ofNullable).takeWhile(
                e -> e.getScore() > bound
        ).collect(Collectors.toList());
        return rsl;
    }
}
