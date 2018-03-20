package ru.job4j.array;

public class SubstringCheck {
   public boolean contains(String origin, String sub) {
        int repNumber = 0;
		char[] data = origin.toLowerCase().toCharArray();
        char[] substring = sub.toLowerCase().toCharArray();

        for (int i = 0; i < data.length - substring.length + 1; i++) {
            for (int j = 0; j < substring.length; j++) {
                if (data[i + j] == substring[j]) {
                    repNumber++;
                }
                if (j == substring.length - 1 && repNumber != substring.length) {
                    repNumber = 0;
                }
            }
        }
        return (repNumber == substring.length);
    }
}