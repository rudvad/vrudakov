package ru.job4j.professions;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HouseTest {
    @Test
    public void checkBuildHouse() {
        House house  = new House(50);
        int expected = 51;
        Engineer engineer = new Engineer("Boris");
        engineer.build(house);
        int result = house.getSquare();
        assertThat(result, is(expected));
    }
}
