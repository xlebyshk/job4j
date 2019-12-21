package ru.job4j.pojo;

public class Book {
    private String title;
    private int pageCount;

    public Book(String name, int pageCount) {
        this.title = name;
        this.pageCount = pageCount;
    }

    public String getName() {
        return title;
    }

    public void setName(String name) {
        this.title = name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
