package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {
	@Test
	public void whenSizeIsThree() {
		Matrix matrix = new Matrix();
        int[][] result = matrix.multiple(3);
        int[][] expected = new int[][] {{0, 1, 2, 3},
										{1, 1, 2, 3},
										{2, 2, 4, 6}, 
										{3, 3, 6, 9}};
        assertThat(result, is(expected));
		}
		
	@Test
	public void whenSizeIsFive() {
		Matrix matrix = new Matrix();
        int[][] result = matrix.multiple(5);
        int[][] expected = new int[][] {{0, 1, 2, 3, 4, 5}, 
										{1, 1, 2, 3, 4, 5}, 
										{2, 2, 4, 6, 8, 10}, 
										{3, 3, 6, 9, 12, 15}, 
										{4, 4, 8, 12, 16, 20}, 
										{5, 5, 10, 15, 20, 25}};
        assertThat(result, is(expected));
		}
}