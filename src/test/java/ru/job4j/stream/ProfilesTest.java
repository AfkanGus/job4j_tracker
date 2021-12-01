package ru.job4j.stream;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {
    @Test
    public void whenCollectAddress() {
        List<Profile> profiles = List.of(
                new Profile(new Address("Orenburg", "Sakmara", 1, 40)),
                new Profile(new Address("Rostov", "Rosa", 2, 20)),
                new Profile(new Address("Tegeran", "Gira", 3, 60))
        );
        Profiles prf = new Profiles();
        List<Address> rsl = prf.collect(profiles);
        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Orenburg", "Sakmara", 1, 40));
        expected.add(new Address("Rostov", "Rosa", 2, 20));
        expected.add(new Address("Tegeran", "Gira", 3, 60));
        assertThat(rsl, is(expected));
    }
}
