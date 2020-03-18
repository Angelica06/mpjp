package ex;

//import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class S04Test {
	@Test
	void sumPositive() {
		long actual = S04.sum(1, 3);

		assertThat(actual, is(6L));
	}

	@Test
	void sumNegPos() {
		long actual = S04.sum(-3, 3);

		assertThat(actual, is(0L));
	}

	@Test
	void sumSingle() {
		long actual = S04.sum(1003, 1003);

		assertThat(actual, is(1003L));
	}

	@Test
	void sumEmpty() {
		long actual = S04.sum(1003, 1002);

		assertThat(actual, is(0L));
	}

	@Test
	void evenSumPositive() {
		long actual = S04.evenSum(1, 3);

		assertThat(actual, is(2L));
	}

	@Test
	void evenSumNegPos() {
		long actual = S04.evenSum(-3, 3);

		assertThat(actual, is(0L));
	}

	@Test
	void evenSumSingle() {
		long actual = S04.evenSum(1002, 1002);

		assertThat(actual, is(1002L));
	}

	@Test
	void evenSumEmpty() {
		long actual = S04.evenSum(1003, 1002);

		assertThat(actual, is(0L));
	}

	@Test
	void factorialFour() {
		long actual = S04.factorial(4);

		assertThat(actual, is(24L));
	}

	@Test
	void factorialNegative() {
		long actual = S04.factorial(-4);

		assertThat(actual, is(0L));
	}

	@Test
	void fibonacci() {
		long actual= S04.fibonacci(7);
				
				assertThat(actual, is(11L));
	}
	
	

	@Test
	void multiplicationTable() {
		final int INPUT = 3;
		int [][] actual= S04.multiplicationTable(INPUT);
		
		assertThat(actual.length,is(INPUT+1)); //mi dice quante righe ci sono
		assertThat(actual[0].length,is(INPUT+1)); //quante colonne
	}
}
