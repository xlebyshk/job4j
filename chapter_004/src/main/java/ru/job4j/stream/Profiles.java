package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        List<Address> rsl = profiles.stream().map(
                Profile::getAddress
        ).distinct().sorted(Comparator.comparing(Address::getCity)).collect(Collectors.toList());
        return rsl;
    }
}
