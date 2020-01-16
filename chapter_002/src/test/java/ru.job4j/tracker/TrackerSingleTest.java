package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.tracker.TrackerSingle;

import static org.hamcrest.core.Is.is;

public class TrackerSingleTest {
    @Test
    public void whenCreate() {
        TrackerSingle tracker = TrackerSingle.INSTANCE;
        TrackerSingle tracker2 = TrackerSingle.INSTANCE;
        Assert.assertThat(tracker, is(tracker2));
    }
}
