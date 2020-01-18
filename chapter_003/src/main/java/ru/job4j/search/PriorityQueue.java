package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<Task>();

    public void put(Task task) {
        int index = 0;
        for (var element : tasks) {
            if (task.getPriority() > element.getPriority()) {
                index++;
                break;
            }
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return this.tasks.remove(0);
    }
}
