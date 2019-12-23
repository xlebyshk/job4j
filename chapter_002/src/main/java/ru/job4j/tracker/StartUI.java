package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                tracker.findAll();
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                tracker.replace(id, tracker.findById(id));
            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                tracker.delete(id);
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                tracker.findById(id);
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                System.out.print("Enter key: ");
                String key = scanner.nextLine();
                tracker.findByName(key);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item\n"
                + "1. Show all items\n"
                + "2. Edit item\n"
                + "3. Delete item\n"
                + "4. Find item by Id\n"
                + "5. Find items by name\n"
                + "6. Exit Program");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
