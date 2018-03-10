package ru.job4j.array;

import org.junit.Test;
import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {

	@Test
	public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
	ArrayDuplicate testArray = new ArrayDuplicate();
	String[] resultArray = testArray.remove(new String[] {"2", "4", "2", "6", "2", "3", "4", "7"});
	String[] expectedArray = new String[] {"2", "4", "7", "6", "3"};
	assertThat(resultArray, is(expectedArray));
	}
}