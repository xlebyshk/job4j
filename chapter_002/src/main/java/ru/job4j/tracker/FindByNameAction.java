package ru.job4j.tracker;

import java.util.function.Consumer;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        String key = input.askStr("Enter key: ");
        for (Item item : tracker.findByName(key)) {
            output.accept("name: " + item.getName() + System.lineSeparator() + "id: " + item.getId());
        }
        output.accept("Done");
        return true;
    }
}
