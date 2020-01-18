package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void whenAsc() {
        Set<UserSort> users = Set.of(
                new UserSort("Petr", 32),
                new UserSort("Ivan", 31)
        );
        Iterator<UserSort> it = users.iterator();
        assertThat(it.next().getName(), is("Ivan"));
        assertThat(it.next().getName(), is("Petr"));
    }

    @Test
    public void whenComparePertVSIvan() {
        int rsl = new UserSort("Petr", 32)
                .compareTo(
                        new UserSort("Ivan", 31)
                );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<UserSort> cmpNamePriority = new UserByName().thenComparing(new UserByAge());
        int rsl = cmpNamePriority.compare(
                new UserSort("A", 0),
                new UserSort("B", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameAndProrityDesc() {
        Comparator<UserSort> cmpNamePriority = new UserDescByName().thenComparing(new UserDescByAge());
        int rsl = cmpNamePriority.compare(
                new UserSort("A", 0),
                new UserSort("B", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
}