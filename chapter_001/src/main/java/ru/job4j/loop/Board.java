package ru.job4j.loop;

public class Board {
	/**
     * Отрисовывание шахматной доски в псевдографике.
     * @param width Ширина поля.
	 * @param height Высота поля.
     * @return Шахматная доска в псевдографике.
     */ 
	 public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}