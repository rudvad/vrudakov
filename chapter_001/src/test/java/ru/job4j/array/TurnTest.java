package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {

@Test
public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
Turn example = new Turn();
int[] resultArray = example.back(new int[] {1, 2, 3, 4, 5, 6});
int[] expectArray = {6, 5, 4, 3, 2, 1};
assertThat(resultArray, is(expectArray));
}

@Test
public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
Turn example = new Turn();
int[] resultArray = example.back(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
int[] expectArray = {9, 8, 7, 6, 5, 4, 3, 2, 1};
assertThat(resultArray, is(expectArray));
}
}

