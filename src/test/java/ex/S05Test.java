package ex;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class S05Test {

	@Test
	void reverseStringPlain() {
		String actual = S05.reverse("abc");

		assertThat(actual, is("cba"));
	}

	@Test
	void isPalindromePlain() {
		boolean actual = S05.isPalindrome("abba");

		assertThat(actual, is(true));
	}

	@Test
	void removeVowelsPlain() {
		String actual = S05.removeVowels("example");

		assertThat(actual, is("xmpl"));
	}

	@Test
	void bin2decPlain() {
		int actual = S05.bin2dec("1001");

		assertThat(actual, is(9));
	}

	@Test
	void reverseIntArrayPlain() {
		int[] original = new int[] { 1, 2, 3 };
		int[] actual = S05.reverse(original);

		assertThat(actual.length, is(original.length));
		for (int i = 0; i < original.length; i++) {
			assertThat(actual[i], is(original[original.length - i - 1]));
		}
	}

	@Test
	void averagePlain() {
		double actual = S05.average(new int[] { 1, 2, 3 });

		assertThat(actual, is(2.0));
	}
	
	@Test
	void averagePlain1() {
		double actual = S05.average(new int[] { -1, 2, 33 });

		assertThat(actual, is(12));
	}
	
	@Test
	void averagePlain2() {
		double actual = S05.average(new int[] { 41, -12, 5 });

		assertThat(actual, closeTo(11.33, 0.001));
	}

	@Test
	void maxPlain() {
		int actual = S05.max(new int[] { 2, 3, 1 });

		assertThat(actual, is(3));
	}
}
