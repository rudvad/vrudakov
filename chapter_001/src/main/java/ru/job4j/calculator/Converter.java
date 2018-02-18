package ru.job4j.calculator;

/**
 * Конвертер валюты.
 */
public class Converter {

private static final int RUBLEINEURO = 70;
private static final int RUBLEINUSD = 60;

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public double rubleToEuro(int value) {
        return value / RUBLEINEURO;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары.
     */
    public double  rubleToDollar(int value) {
        return value / RUBLEINUSD;
    }
	
	/**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return Рубли.
     */
    public double  euroToRuble(int value) {
        return value * RUBLEINEURO;
    }
	
	/**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return Рубли.
     */
    public double  dollarToRuble(int value) {
        return value * RUBLEINUSD;
    }
}