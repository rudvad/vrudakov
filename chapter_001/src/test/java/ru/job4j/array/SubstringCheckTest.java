package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SubstringCheckTest {
	@Test
	public void whenStringContains() {
	SubstringCheck test = new SubstringCheck();
	boolean result = test.contains("welcome", "com");
	assertThat(result, is(true));
	}
	
	@Test
	public void whenStringNotContains() {
	SubstringCheck test = new SubstringCheck();
	boolean result = test.contains("welcome", "moc");
	assertThat(result, is(false));
	}
}