package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

public class UserConvert {
    public static HashMap<String, User> process(List<User> users) {
        HashMap<String, User> rsl = new HashMap<>();
        for (User user : users) {
            rsl.put(user.getId(), user);
        }
        return rsl;
    }
}
