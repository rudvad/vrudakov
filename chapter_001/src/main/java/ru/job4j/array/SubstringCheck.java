package ru.job4j.array;

public class SubstringCheck {

boolean contains(String origin, String sub) { 
int repNumber = 0;
boolean result = false;
char[] data = origin.toLowerCase().toCharArray();
char[] substring = sub.toLowerCase().toCharArray();
    for (int i = 0; i < data.length; i++) {
        for (int j = 0; j < substring.length; j++) {
            if (data[i] == substring[j]) {
                repNumber++;
                if (repNumber == substring.length) {
                    result = true;
                    break;
                    }
                }
            }
        }
        return result;
    }
}