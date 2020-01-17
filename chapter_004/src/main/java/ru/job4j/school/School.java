package ru.job4j.school;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
}
