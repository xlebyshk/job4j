package ru.job4j.poly;

public interface Transport {
    void go();

    void passengers(int count);

    int fillUp(int fuel);

}
