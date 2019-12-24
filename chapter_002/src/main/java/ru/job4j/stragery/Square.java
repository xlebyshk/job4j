package ru.job4j.stragery;

public class Square implements Shape {
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("@@@@@@@");
        pic.append("@     @");
        pic.append("@     @");
        pic.append("@@@@@@@" + System.lineSeparator());
        return pic.toString();
    }
}
