package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 */
public class Fit {
	
	private static final double MNOG = 1.15;
	private static final double FOR_MAN = 100;
	private static final double FOR_WOMAN = 110;
	
    /**
     * Идеальный вес для мужчины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double manWeight(double height) {
        return (height - FOR_MAN) * MNOG;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double womanWeight(double height) {
        return (height - FOR_WOMAN) * MNOG;
    }
}