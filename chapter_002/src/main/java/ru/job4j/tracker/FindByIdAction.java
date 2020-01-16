package ru.job4j.tracker;

import java.util.function.Consumer;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by Id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        String id = input.askStr("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            output.accept("name: " + item.getName() + System.lineSeparator()  + "id: " + item.getId());
        } else {
            output.accept("Not found");
        }

        return true;
    }
}
