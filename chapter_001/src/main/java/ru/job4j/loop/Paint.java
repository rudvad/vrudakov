package ru.job4j.loop;

/**
 * @author Vadim Rudakov (vadim@rudakov.pw)
 * @version $Id$
 * @since 0.1
 * Рисование пирамиды в псевдографике.
 */
public class Paint {
    /**
     *  Отрисовывает в псевдографике треугольник как правую половину пирамиды.
     *  @param height Высота треугольника.
     */
    public String rightTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    /**
     *  Отрисовывает в псевдографике треугольник как левую половину пирамиды.
     *  @param height Высота треугольника.
     */
	public String leftTrl(int height) {
    StringBuilder screen = new StringBuilder();
    int weight = height;
    for (int row = 0; row != height; row++) {
        for (int column = 0; column != weight; column++) {
            if (row >= weight - column - 1) {
                screen.append("^");
            } else {
                screen.append(" ");
            }
        }
        screen.append(System.lineSeparator());
		}
    return screen.toString();
	}

    /**
     *  Отрисовывает в псевдографике пирамиду целиком.
     *  @param height Высота пирамиды.
     */
	public String pyramid(int height) {
    StringBuilder screen = new StringBuilder();
    int weight = 2 * height - 1;
    for (int row = 0; row != height; row++) {
        for (int column = 0; column != weight; column++) {
            if (row >= height - column - 1 && row + height - 1 >= column) {
                screen.append("^");
            } else {
                screen.append(" ");
            }
        }
        screen.append(System.lineSeparator());
    }
    return screen.toString();
}
}