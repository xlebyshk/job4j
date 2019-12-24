package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        tracker.delete(id);
        if (tracker.delete(id)) {
            System.out.println("Done");
        } else {
            System.out.println("Not found");
        }
        return true;
    }
}
