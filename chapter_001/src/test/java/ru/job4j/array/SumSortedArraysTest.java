package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SumSortedArraysTest {
	@Test
	public void whenFirstLongerThanSecond() {
	SumSortedArrays test = new SumSortedArrays();
	int[] result = test.sumArrays(new int[] {1, 2, 3, 3, 5, 5, 7}, new int[] {3, 4, 6, 12});
	int[] expected = new int[] {1, 2, 3, 3, 3, 4, 5, 5, 6, 7, 12};
	assertThat(result, is(expected));
	}
	
	@Test
	public void whenSecondLongerThanFirst() {
	SumSortedArrays test = new SumSortedArrays();
	int[] result = test.sumArrays(new int[] {3, 4, 6, 12}, new int[] {1, 2, 3, 3, 5, 5, 7});
	int[] expected = new int[] {1, 2, 3, 3, 3, 4, 5, 5, 6, 7, 12};
	assertThat(result, is(expected));
	}
}