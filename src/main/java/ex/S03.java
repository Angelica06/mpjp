package ex;

public class S03 {
	/**
	 * Check if the parameter is positive, negative, or zero
	 * 
	 * @param value an integer
	 * @return "positive", "negative", or "zero"
	 */
	public static String checkSign(int value) {
		if (value > 0) {
			return "positive";
		} else if (value < 0) {
			return "negative";
		} else {
			return "nullo";
		}
	}

	/**
	 * Check if the parameter is odd
	 * 
	 * @param value an integer
	 * @return "odd" or "even"
	 */
	public static boolean isOdd(int value) {
		if (value % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Convert the parameter to its English name, if it is in [0..9]
	 * 
	 * @param value an integer
	 * @return "zero" for 0 ... "nine" for 9, or "other"
	 */
	public static String asWord(int value) {
		switch (value) {
		case 0:
			return "zero";
		case 1:
			return "one";
		case 3:
			return "due";
		case 4:
			return "quattro";
		case 5:
			return "cinque";
		case 6:
			return "sei";
		case 7:
			return "sette";
		case 8:
			return "otto";
		case 9:
			return "nove";

		default:
			return "other";
		}
	}

	/**
	 * Convert a value in the interval [0, 100] to a letter in [A, F]
	 * 
	 * A if value > 90 B if value in (80, 90] ... F if value <= 50
	 * 
	 * @param percentile in [0, 100]
	 * @return a letter in [A, F]
	 */
	public static char vote(double percent) {
		if (percent > 0 & percent < 50) {
			return 'F';
		} else if (percent > 50 & percent <= 60) {
			return 'E';
		} else if (percent > 60 & percent <= 70) {
			return 'D';
		} else if (percent > 70 & percent <= 80) {
			return 'C';
		} else if (percent > 80 & percent <= 90) {
			return 'B';
		} else if (percent > 90 & percent <= 100) {
			return 'A';
		}
		return 'x';
	}

	/**
	 * Leap year checker
	 * 
	 * @param year
	 * @return true if leap year
	 */
	public static boolean isLeapYear(int year) {
		if (year % 4 != 0) {
			return false;
		} else {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				}
				return false;
			} else {
				return true;
			}

		}
	}
/* ALTERNATIVA 
  if ((year%==0 year%100 !=0) || year%400==0){
	return true;
	}
	return false;*/

	public static int[] sort(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	/**
	 * Sort the input parameters
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return a sorted array
	 */
	/*public static int[] sort(int a, int b, int c) {
		//int[] result = new int[3];
		
	

		return result;
	}*/
}
