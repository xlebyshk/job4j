package ru.job4j.tracker;

import java.util.function.Consumer;

public class ShowAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        for (Item item : tracker.findAll()) {
            output.accept("name: " + item.getName() + System.lineSeparator()  + "id: " + item.getId());
        }
        return true;
    }
}
