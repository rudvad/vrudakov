package ru.job4j.calculator;

/**
 * Конвертер валюты.
 */
public class Converter {

private final int rubInEur = 70;
private final int rubInUsd = 60;

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public double rubleToEuro(int value) {
        return value / rubInEur;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары.
     */
    public double  rubleToDollar(int value) {
        return value / rubInUsd;
    }
	
	/**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return Рубли.
     */
    public double  euroToRuble(int value) {
        return value * rubInEur;
    }
	
	/**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return Рубли.
     */
    public double  dollarToRuble(int value) {
        return value * rubInUsd;
    }
}