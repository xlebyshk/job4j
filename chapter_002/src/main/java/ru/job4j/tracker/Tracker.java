package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tracker {

    private final List<Item> items = new ArrayList<>();


    public Item add(Item item) {
        item.setId(this.generateId());
        this.items.add(item);
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public List<Item> findAll() {
        return this.items;
    }

    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        for (Item item : this.items) {
            if (item.getName().equals(key)) {
                result.add(item);
            }
        }
        return result;
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < this.items.size(); index++) {
            if (this.items.get(index).getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(String id, Item item) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
            this.items.set(index, item);
            item.setId(id);
            result = true;
        }
        return result;
    }

    public boolean delete(String id) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
            this.items.remove(index);
            result = true;
        }
        return result;
    }


    public Item findById(String id) {
        Item result = null;
        for (Item item : this.items) {
            if (item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
}