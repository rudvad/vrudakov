package ru.job4j.professions;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfessionTest {
    @Test
    public void checkNameDoctor() {
        Doctor doc = new Doctor("George");
        String expected = "George";
        String result = doc.getName();
        assertThat(result, is(expected));
    }

    @Test
    public void checkProfessionDoctor() {
        Doctor doc = new Doctor("George");
        String expected = "Doctor";
        String result = doc.getProfession();
        assertThat(result, is(expected));
    }



}