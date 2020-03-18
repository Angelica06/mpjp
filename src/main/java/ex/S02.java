package ex;
import java.lang.Math;

//import jdk.internal.joptsimple.internal.String;
public class S02 {
	/**
	 * Average speed
	 * 
	 * @param distance in meters
	 * @param time     in seconds
	 * @return speed in meters per second
	 */
	public static double speed(double distance, double time) {
		double result = ((double) (distance/time));
		return result;
	}

	/**
	 * Distance between (x0, y0) and (x1, y1)
	 * 
	 * @param x0 first point x
	 * @param y0 first point y
	 * @param x1 second point x
	 * @param y1 second point y
	 * @return distance
	 */
	public static double distance(int x0, int y0, int x1, int y1) {
		double result=Math.sqrt(Math.pow((x1-x0), 2)+Math.pow((y1-y0), 2));
		return result;
	}

	/**
	 * Engine capacity
	 * 
	 * @param bore   in mm
	 * @param stroke in mm
	 * @param nr     number of cylinders
	 * @return the engine capacity in cm^3
	 */
	public static double engineCapacity(double bore, double stroke, int nr) {
		double areaCerchio= Math.pow((bore/2),2)*Math.PI;
		double areaCilindro= areaCerchio*stroke;
		double result = areaCilindro*nr;
		return result;
	}

	/**
	 * Add up all the digits in an integer
	 * 
	 * @param value
	 * @return sum of digits
	 */
	public static int digitSum(int value) {
		value=Math.abs(value);
		int somma= 0;
		while (value>0) {
			int cifra= value%10;
			
			somma += cifra;
		}
		return somma;
	}

	/**
	 * Score based on distance from (0, 0) [1, 5, 10] -> [10, 5, 1, 0]
	 *
	 * @param x
	 * @param y
	 *
	 * @return
	 */
	public static int score(double x, double y) {
		// TODO
		return 0;
	}
}
