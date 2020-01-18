package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UserConvertTest {
    @Test
    public void whenSingleOrder() {
        List<User> orders = List.of(
                new User("3sfe", "Dress")
        );
        HashMap<String, User> map = UserConvert.process(orders);
        assertThat(map.get("3sfe"), is(new User("3sfe", "Dress")));
    }
}
