package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return " === Update item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id:");
        String name = input.askStr("Enter a new name of item: ");
        Item item = new Item(name);
        item.setId(id);
        if (tracker.replace(id, item)) {
            System.out.println("name: " + item.getName() + System.lineSeparator() + "id: " + item.getId());
        } else {
            System.out.println("Not found");
        }
        return true;
    }
}
