package ru.job4j.array;

public class Turn {
/**
* Переворот массива задом наперед.
* @param array Исходный массив.
* @return Перевернутый массив.
*/ 
public int[] back(int[] array) {
int temp;	
for (int i = 0; i < array.length / 2; i++) {
temp = array[i];
array[i] = array[array.length - i - 1];
array[array.length - i - 1] = temp;	
}
return array;	
}
}