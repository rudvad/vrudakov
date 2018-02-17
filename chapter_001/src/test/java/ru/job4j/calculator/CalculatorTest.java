package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	
	@Test
    public void whenSubstractThreeMinusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.substract(3D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	
	@Test
    public void whenDivSixOnTwoThenThree() {
        Calculator calc = new Calculator();
        calc.div(6D, 2D);
        double result = calc.getResult();
        double expected = 3D;
        assertThat(result, is(expected));
    }
	
	@Test
    public void whenMultipleFiveOnTwoThenTen() {
        Calculator calc = new Calculator();
        calc.div(5D, 2D);
        double result = calc.getResult();
        double expected = 10D;
        assertThat(result, is(expected));
    }
	
}