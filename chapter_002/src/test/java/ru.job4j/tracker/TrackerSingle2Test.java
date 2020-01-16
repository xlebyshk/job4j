package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.tracker.TrackerSingle2;

import static org.hamcrest.core.Is.is;

public class TrackerSingle2Test {
    @Test
    public void whenCreate() {
        TrackerSingle2 tracker = TrackerSingle2.getInstance();
        TrackerSingle2 tracker2 = TrackerSingle2.getInstance();
        Assert.assertThat(tracker, is(tracker2));
    }
}
