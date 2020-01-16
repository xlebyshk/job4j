package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.tracker.TrackerSingle3;

import static org.hamcrest.core.Is.is;

public class TrackerSingle3Test {
    @Test
    public void whenCreate() {
        TrackerSingle3 tracker = TrackerSingle3.getInstance();
        TrackerSingle3 tracker2 = TrackerSingle3.getInstance();
        Assert.assertThat(tracker, is(tracker2));
    }
}
