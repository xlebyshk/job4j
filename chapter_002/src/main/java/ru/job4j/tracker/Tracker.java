package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {

    private final Item[] items = new Item[100];

    private int position = 0;

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item[] findAll() {
        Item[] result = Arrays.copyOf(items, this.position);
        return result;
    }

    public Item[] findByName(String key) {
        int size = 0;
        Item[] result = new Item[this.position];
        for (int index = 0; index < this.position; index++) {
            if (items[index].getName().equals(key)) {
                result[size++] = this.items[index];
            }
        }
        return Arrays.copyOf(result, size);
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < this.position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /*public Item findById(String id) {
        Item result = null;
        result = items[indexOf(id)];
        return result;
    }*/

    public void replace(String id, Item item) {
        this.items[indexOf(id)] = item;
        item.setId(id);
    }

    public boolean delete(String id) {
        int index = indexOf(id);
        if (index != -1) {
            int start = index + 1;
            int distPos = index;
            int size = position - index;
            System.arraycopy(items, start, items, distPos, size);
            items[position] = null;
            position--;
            return true;
        }
        return false;
    }


    public Item findById(String id) {
        Item result = null;
        for (int index = 0; index < this.position; index++) {
            if (items[index].getId().equals(id)) {
                result = items[index];
                break;
            }
        }
        return result;
    }
}