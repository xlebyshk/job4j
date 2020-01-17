package ru.job4j.stream;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {

    @Test
    public void ListAddress() {
        Profiles profiles = new Profiles();
        List<Profile> profiles1 = Collections.singletonList(new Profile(new Address("st.Petersburg", "Gagarina", 24, 168)));
        List<Address> result = profiles.collect(profiles1);
        assertThat(result.get(0).getCity(), is("st.Petersburg"));
    }

    @Test
    public void WhenTheAddressIsEqualCompareTheCity() {
        Profiles profiles = new Profiles();
        List<Profile> profiles1 = List.of(
                new Profile(new Address("Samara", "Gagarina", 24, 168)),
                new Profile(new Address("Moscow", "Gagarina", 24, 168)),
                new Profile(new Address("st.Petersburg", "Gagarina", 24, 168))
        );
        List<Address> result = profiles.collect(profiles1);
        assertThat(result.get(0).getCity(), is("Moscow"));
    }
}