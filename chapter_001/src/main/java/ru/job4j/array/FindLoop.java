package ru.job4j.array;

public class FindLoop {
/**
 * Поиск значения в массиве методом перебора.
 * @param data Массив для поиска
 * @param el Искомый элемент.
 * @return Индекс первого по счету элемента массива c искомым значением.
 */
	public int indexOf(int[] data, int el) {
int rsl = -1;
int bound = data.length;
for (int index = 0; index < bound; index++) {
	if (data[index] == el) {
		rsl = index;
        break;
			}
		}
   return rsl;
	}
}