package ru.job4j.collection;

import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void whenAsc() {
        Set<UserSort> users = new TreeSet<>();
        users.add(new UserSort("Petr", 32));
        users.add(new UserSort("Ivan", 31));
        Iterator<UserSort> it = users.iterator();
        assertThat(it.next(), is(new UserSort("Petr", 32)));
        assertThat(it.next(), is(new UserSort("Ivan", 31)));
    }

    @Test
    public void whenComparePertVSIvan() {
        int rsl = new UserSort("Petr", 32)
                .compareTo(
                        new UserSort("Ivan", 31)
                );
        assertThat(rsl, greaterThan(0));
    }
}