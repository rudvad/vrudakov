package ru.job4j.array;

import java.util.Arrays;
/**
 * Удаление повторяющихся символов из массива.
 */
public class ArrayDuplicate {
/**
 * Возвращает новый массив без повторяющихся значений.
 * @param array Исходный массив
 * @return Массив меньшего размера без повторяющихся значений.
 * */
public String[] remove(String[] array) {
String buffer;
int repeatNumber = 0;
	for (int i = 0; i < array.length - 2; i++) {
		for (int j = i + 1; j < array.length - repeatNumber; j++) {
			if (array[i].equals(array[j])) {
			repeatNumber++;
			buffer = array[j];
			array[j] = array[array.length - repeatNumber];
			array[array.length - repeatNumber] = buffer;
			}	
		}
	}
	return Arrays.copyOf(array, array.length - repeatNumber);
}
}