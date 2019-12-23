package ru.job4j.poly;

public class Bus implements Transport {
    private boolean ready = false;
    private int passenger = 0;

    @Override
    public void go() {
        this.ready = true;
    }

    @Override
    public void passengers(int count) {
        this.passenger += count;
    }

    @Override
    public int fillUp(int fuel) {

        return fuel * 50;
    }
}
