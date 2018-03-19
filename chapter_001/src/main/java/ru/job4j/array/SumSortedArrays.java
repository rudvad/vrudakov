package ru.job4j.array;

public class SumSortedArrays {
	public static int[] sumArrays(int[] a, int[] b) {
		int newLength = a.length + b.length;
        int[] c = new int[newLength];
		int i = a.length - 1, j = b.length - 1;

        while (newLength > 0) {
                c[--newLength] = (j < 0 || (i >= 0 && a[i] >= b[j])) ? a[i--] : b[j--];
			}
        return c;
    }
}