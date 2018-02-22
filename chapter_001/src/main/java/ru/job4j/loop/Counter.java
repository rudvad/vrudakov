package ru.job4j.loop;

public class Counter {
	/**
     * Подсчет суммы чётных чисел в диапазоне.
     * @param start Начало диапазона.
	 * @param finish Конец диапазона.
     * @return Сумма четных чисел.
     */ 
	 
	public int add(int start, int finish) {
	int rsl = 0;
	for (int i = start; i <= finish; i++) {
		if (i % 2 == 0) {
			rsl += i;
			}	
		}
	return rsl;		
	}
}