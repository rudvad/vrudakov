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
}