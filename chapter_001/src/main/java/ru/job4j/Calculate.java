package ru.job4j;

/**
 * Calculate.
 *
 * @author Vadim Rudakov (vadim@rudakov.pw)
 * @version $Id$
 * @since 0.1
 */
public class Calculate {
    /**
     * Method main. Выводит строку в консоль.
     * @param args - args.
	 * @return "Hello World" string
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
	
	/**
* Method echo.
* @param name Your name.
* @return Echo plus your name.
*/

	public String echo(String name) {
		return "Echo, echo, echo : " + name;
	}
}
