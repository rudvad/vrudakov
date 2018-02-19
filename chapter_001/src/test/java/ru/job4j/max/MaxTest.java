package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Vadim Rudakov (vadim@rudakov.pw)
 * @version $Id$
 * @since 0.1
 */
public class MaxTest {

	@Test
	public void whenFirstLessSecond() {
    Max maxim = new Max();
    int result = maxim.max(1, 2);
    assertThat(result, is(2));
	}
	
	@Test
	public void whenSecondLessFirst() {
    Max maxim = new Max();
    int result = maxim.max(6, 2);
    assertThat(result, is(6));
	}
	
	@Test
	public void whenBothEqual() {
    Max maxim = new Max();
    int result = maxim.max(7, 7);
    assertThat(result, is(7));
	}
}