package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ItemSort implements Comparator<Item> {

    @Override
    public int compare(Item first, Item second) {
        return first.getName().compareTo(second.getName());
    }

    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("Sergey"),
                new Item("Igor")
        );
        System.out.println("unsort");
        System.out.println(items);
        Collections.sort(items, new ItemSort());
        System.out.println("sort");
        System.out.println(items);
    }
}
