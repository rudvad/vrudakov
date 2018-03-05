package ru.job4j.array;

public class Matrix {

public int[][] multiple(int size) {
int newSize = size + 1;	
int[][] resultArray = new int[newSize][newSize];	
	for (int i = 0; i <= size; i++) { 
		for (int j = 0; j <= size; j++) {
			if (i != 0 && j != 0) {
			resultArray[i][j] = i * j;		
			} else {
			resultArray[i][j] = i + j;	
			}
		}
	}
	return resultArray;
}
}