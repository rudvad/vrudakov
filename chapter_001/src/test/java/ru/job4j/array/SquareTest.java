package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenBoundIsSix() {
       Square square = new Square();
        int[] result = square.calculate(6);
        int[] expected = new int[] {1, 4, 9, 16, 25, 36};
        assertThat(result, is(expected));
	}
	
	 @Test
    public void whenBoundIsEight() {
       Square square = new Square();
        int[] result = square.calculate(8);
        int[] expected = new int[] {1, 4, 9, 16, 25, 36, 49, 64};
        assertThat(result, is(expected));
	}
}