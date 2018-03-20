package ru.job4j.array;

public class Square {
/**
 * Заполняет массив размером N квадратами чисел по порядку от 1 до N.
 * @param bound Исходный массив.
 * @return Массив чисел, возведенных в квадрат.
 */
public int[] calculate(int bound) {
int[] rsl = new int[bound];
	for (int i = 0; i <= bound - 1; i++) {
	rsl[i] = (int) Math.pow(i + 1, 2); 
		}
    return rsl;
	}
}