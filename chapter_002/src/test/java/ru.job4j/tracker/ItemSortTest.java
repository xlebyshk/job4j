package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ItemSortTest {

    @Test
    public void sort() {

        List<Item> ex = List.of(new Item("Igor"), new Item("Sergey"));
        List<Item> items = Arrays.asList(
                new Item("Sergey"),
                new Item("Igor")
        );

        Collections.sort(items, new ItemSort());
        List<Item> out = items;
        assertThat(ex.toString(), is(out.toString()));
    }

    @Test
    public void sortReverse() {

        List<Item> ex = List.of(new Item("Sergey"), new Item("Igor"));
        List<Item> items = Arrays.asList(
                new Item("Sergey"),
                new Item("Igor")
        );

        Collections.sort(items, new ItemSortReverse());
        List<Item> out = items;
        assertThat(ex.toString(), is(out.toString()));
    }
}
