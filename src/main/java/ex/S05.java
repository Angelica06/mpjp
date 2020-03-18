package ex;

public class S05 {
	/**
	 * Reverse a string
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static String reverse(String s) {
		StringBuilder result = new StringBuilder(s.length());
		for (int i = s.length() - 1; i >= 0; i--) {
			result.append(s.charAt(i));
		}
		return result.toString();
	}

	/**
	 * Check if the parameter is a palindrome
	 * 
	 * @param s
	 * @return true if the parameter is a palindrome
	 */
	public static boolean isPalindrome(String s) {
		String result = reverse(s);
		if (s.equals(result.toString())) { // == confronta il reference!
			// equals confronta il valore!
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Remove vowels from the parameter
	 * 
	 * @param s
	 * @return a string, same of input but without vowels
	 */
	public static String removeVowels(String s) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i <s.length(); i++) {
			char cur= s.charAt(i);
			if (cur != 'a' &&
					cur != 'e' &&
					cur != 'i' &&
					cur != 'o'&&
					cur != 'u') {
				result.append(s.charAt(i));
			}
		}
		return result.toString();
	}

	/**
	 * Convert from binary to decimal
	 * 
	 * @param s a string that contains the binary representation of an integer
	 * @return the converted integer
	 */
	public static int bin2dec(String s) {
		// TODO
		return 0;
	}

	/**
	 * Reverse an array of integers
	 * 
	 * @param data
	 * @return a new array holding the same elements of input, in reversed order
	 */
	public static int[] reverse(int[] data) {
		int[] result = new int[0];
		for (int i=0;i<data.length;i++) {
			int temp=data[i];
			for (int j=0; j< data.length;j++) {
				result[j]=temp;
			}
		}
		return result;

	}

	/**
	 * Calculate the average
	 * 
	 * @param data array
	 * @return the average
	 */
	public static double average(int[] data) {
		double somma=data[0];
		for (int i=1 ; i<data.length ; i++) {
			somma+=data[i];
		}
		return somma/data.length;
	}

	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */
	public static int max(int[] data) {
		if (data==null || data.length==0) {
			return Integer.MIN_VALUE;
		}
		
		int max = data[0];
		for (int i = 1; i <data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}
}
