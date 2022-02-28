package edu.kis.vh.nursery;

import edu.kis.vh.nursery.intlists.IntArrayStack;
import org.junit.Assert;
import org.junit.Test;

/**
 * The type Rhymers j unit test.
 */
public class RhymersJUnitTest {

	/**
	 * Test count in.
	 * Testowanie dodawania elementów do wyliczanki.
	 */
	@Test
	public void testCountIn() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int STACK_CAPACITY = IntArrayStack.CAPACITY;

		for (int testValue = 0; testValue < STACK_CAPACITY; ++testValue)
		{
			rhymer.countIn(testValue);
			int result = rhymer.peekaboo();
			Assert.assertEquals(testValue, result);
		}

		rhymer.countIn(0);
		int result = rhymer.peekaboo();
		Assert.assertEquals(IntArrayStack.LAST_INDEX, result);
	}

	/**
	 * Test call check.
	 * Testowanie poprawnego sprawdzania braku elementów w wyliczance.
	 */
	@Test
	public void testCallCheck() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

		boolean result = rhymer.isEmpty();
		Assert.assertTrue(result);

		rhymer.countIn(888);

		result = rhymer.isEmpty();
		Assert.assertFalse(result);
	}

	/**
	 * Test is full.
	 * Testowanie poprawnego sprawdzenia zapełnienia wyliczanki.
	 */
	@Test
	public void testIsFull() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

		final int STACK_CAPACITY = IntArrayStack.CAPACITY;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertFalse(result);
			rhymer.countIn(888);
		}

		boolean result = rhymer.isFull();
		Assert.assertTrue(result);
	}

	/**
	 * Test peekaboo.
	 * Testowanie pobierania wartośći ostatniego olementu w wyliczance.
	 */
	@Test
	public void testPeekaboo() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = IntArrayStack.EMPTY;

		int result = rhymer.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	/**
	 * Test count out.
	 * Testowanie pobierania ostatniego olementu w wyliczance.
	 */
	@Test
	public void testCountOut() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = IntArrayStack.EMPTY;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
