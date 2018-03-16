package ru.job4j.array;

public class SumSortedArrays {
public static int[] sumArrays(int[] a, int[] b) {
        int newLength = a.length + b.length;
        int[] c = new int[newLength];
        for (int counterA = 0, counterB = 0, counterC = 0; counterC < newLength; counterC++) {
            if (counterA < a.length) {
                if (counterB < b.length) {
                    if (a[counterA] < b[counterB]) {
                        c[counterC] = a[counterA++];
                    } else {
                        c[counterC] = b[counterB++]; 
						} 
				} else {
                    c[counterC] = a[counterA++];
					}
            } else {
                c[counterC] = b[counterB++];
				}
        }
        return c;
    }
}