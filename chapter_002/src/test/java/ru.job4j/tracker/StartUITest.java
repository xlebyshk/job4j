package ru.job4j.tracker;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Consumer;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final Consumer<String> output = new Consumer<String>() {
        private final PrintStream stdout = new PrintStream(out);

        @Override
        public void accept(String s) {
            stdout.println(s);
        }
    };

    @Test
    public void whenCheckOutput() {
        /*Tracker tracker = new Tracker();
        Item item = new Item("fix bug");
        tracker.add(item);
        ShowAction act = new ShowAction();
        act.execute(new StubInput(new String[]{}), tracker, System.out::println);
        String expected = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("name: " + item.getName() + System.lineSeparator() + "id: " + item.getId())
                .toString();
        assertThat(new String(out.toByteArray()), is(expected));*/
    }

}