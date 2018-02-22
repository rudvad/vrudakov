package ru.job4j.loop;

public class Factorial {
	/**
     * Подсчет факториала для заданного аргумента
     * @param n Аргумент.
     * @return Факториал аргумента.
     */ 
	 
	public int fact(int n) {
	int rsl = 1;
	for (int i = 1; i <= n; i++) {
	rsl *= i;	
		}	
	return rsl;
	}
}