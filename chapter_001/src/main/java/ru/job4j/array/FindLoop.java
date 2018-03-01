package ru.job4j.array;

public class FindLoop {

public int indexOf(int[] data, int el) {
/**
     * Поиск значения в массиве методом перебора.
     * @param data Массив для поиска
	 * @param el Искомый элемент.
     * @return Индекс первого по счету элемента и искомым занчением.
     */ 
    int rsl = -1; // если элемента нет в массиве, то возвращаем -1.
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