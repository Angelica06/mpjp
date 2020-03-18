package ex;

public class S04 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {
		if (Math.abs(last) > Math.abs(first)) {
			int result = Math.abs(last);
			// faccio la somma
			while (first <last) {
				last -= 1;
				result+=last;
			}
			return result;
		} else if (last == first) {
			return Math.abs(last);
		}
		else {
			// se last < first
			return 0;
		}
	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		long result= 0;
		for (int i = first; i <= last; i++) {
			if (i%2==0) {
				result+=i;
			}
		}
		return result;
	}

	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {
		
		long result= 1;
		if(value<0) {
			return 0;
		}
		for (int i=value; i>0; i--) {
			result*=i;
		}
		return result;
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, �)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {
		long result= 1;
		if(value<0) {
			return 0;
		}
		for (int i=value; i>0; i--) {
			result=(value-2)+(value-1);
		}
		return result;
	}// é sbagliato, fibonacci di 6 è 8, fibonacci di 7 è 13!

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[0][0];
		

		// TODO

		return result;
	}
}
