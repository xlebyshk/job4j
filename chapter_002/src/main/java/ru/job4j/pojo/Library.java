package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 900);
        Book java = new Book("Java 8", 2000);
        Book designPatterns = new Book("Design Patterns", 645);
        Book thinkingInJava = new Book("Thinking in Java", 2500);

        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = java;
        books[2] = designPatterns;
        books[3] = thinkingInJava;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println("Book name: " + bk.getName() + "\nBook page count: " + bk.getPageCount());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        System.out.println("\nSwap index 0 and 3. \n");

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println("Book name: " + bk.getName() + "\nBook page count: " + bk.getPageCount());
        }

        System.out.println("\nBooks titled: Clean code. \n");

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getName().equals("Clean code")) {
                System.out.println("Book name: " + bk.getName() + "\nBook page count: " + bk.getPageCount());
            }
        }
    }
}
