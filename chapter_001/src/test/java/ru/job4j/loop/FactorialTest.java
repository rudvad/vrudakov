package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
	Factorial example = new Factorial();
    int result = example.fact(5);
    assertThat(result, is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
	Factorial example = new Factorial();
    int result = example.fact(0);
    assertThat(result, is(1));
    }
}

