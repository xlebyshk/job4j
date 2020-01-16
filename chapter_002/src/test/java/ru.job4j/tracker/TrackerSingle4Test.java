package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.tracker.TrackerSingle4;

import static org.hamcrest.core.Is.is;

public class TrackerSingle4Test {
    @Test
    public void whenCreate() {
        TrackerSingle4 tracker = TrackerSingle4.getInstance();
        TrackerSingle4 tracker2 = TrackerSingle4.getInstance();
        Assert.assertThat(tracker, is(tracker2));
    }
}
