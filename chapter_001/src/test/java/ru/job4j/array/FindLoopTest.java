package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void whenElementPresent() {
       FindLoop loop = new FindLoop();
        int result = loop.indexOf(new int[] {5, 8, 2, 4, 7, 6, 0, 3}, 7);
        int expected = 4;
        assertThat(result, is(expected));
	}
	
	 @Test
    public void whenThereIsNoElement() {
       FindLoop loop = new FindLoop();
        int result = loop.indexOf(new int[] {5, 8, 2, 4, 7, 6, 0, 3}, 1);
        int expected = -1;
        assertThat(result, is(expected));
	}
}