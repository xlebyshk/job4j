package ru.job4j.school;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SchoolTest {

    @Test
    public void class10A() {
        Student student = new Student(45);
        Student student2 = new Student(84);
        List<Student> students = Arrays.asList(student, student2);
        School school = new School();
        List<Student> rsl = school.collect(students, s -> s.getScore() > 70);
        assertThat(rsl.get(0), is(student2));
    }

    @Test
    public void class10B() {
        Student student = new Student(66);
        Student student2 = new Student(71);
        List<Student> students = Arrays.asList(student, student2);
        School school = new School();
        List<Student> rsl = school.collect(students, s -> s.getScore() > 50 && s.getScore() < 70);
        assertThat(rsl.get(0), is(student));
    }

    @Test
    public void class10C() {
        Student student = new Student(11);
        Student student2 = new Student(54);
        List<Student> students = Arrays.asList(student, student2);
        School school = new School();
        List<Student> rsl = school.collect(students, s -> s.getScore() < 50);
        assertThat(rsl.get(0), is(student));
    }

    @Test
    public void convertListToMap() {
        Student student = new Student(89, "Sergey");
        List<Student> students = Collections.singletonList(student);
        School school = new School();
        Map<String, Student> rsl = school.convertToMap(students);
        assertThat(rsl.containsKey("Sergey"), is(true));
        assertThat(rsl.containsValue(student), is(true));
    }
}
