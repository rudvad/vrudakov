package ru.job4j.condition;

/**
 * @author Vadim Rudakov (vadim@rudakov.pw)
 * @version $Id$
 * @since 0.1
 */
 
public class Point {
   private int x;
   private int y;
 
   public  Point(int x, int y) {
      this.x = x;
      this.y = y;
  }
  
  /**
  * Расстояние между точками A (x1,y1) и B(x2,y2) на плоскости.
  * @param another Точка B(x2,y2).
  * @return Расстояние.
  */
  public double distanceTo(Point another) {
    return Math.sqrt(
            Math.pow(this.x - another.x, 2) + Math.pow(this.y - another.y, 2)
		);
	}
}