package ru.job4j.max;

/**
 * @author Vadim Rudakov (vadim@rudakov.pw)
 * @version $Id$
 * @since 0.1
 */
 
public class Max {
	 /**
     * Поиск большего числа из двух заданных.
     * @param first Первое число.
	 * @param second Второе число.
     * @return Большее число.
     */ 
	 
	 public int max(int first, int second) {
	 return (first > second) ? first : second;
	 }
	 
	  /**
     * Поиск большего числа из трех заданных.
     * @param first Первое число.
	 * @param second Второе число.
	 * @param third Третье число.
     * @return Большее число.
     */ 
	 
	 public int max(int first, int second, int third) {
		return  max(max(first, second), max(second, third));
	 }

}