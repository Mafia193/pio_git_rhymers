package edu.kis.vh.nursery.intlists;

import edu.kis.vh.nursery.IntStack;

public class IntArrayStack implements IntStack {

	/**
	 * The constant LAST_INDEX.
	 */
	public static final int LAST_INDEX = 11;
	/**
	 * The constant CAPACITY.
	 */
	public static final int CAPACITY = LAST_INDEX + 1;
	private final int[] numbers = new int[CAPACITY];


	private int total = EMPTY;

	/**
	 * Count in.
	 *  Dodaje element do wyliczanki jeżeli nie jest pełna.
	 * @param in the in
	 */
	@Override
	public void countIn(int in) {
		if (!isFull())
			numbers[total++] = in;
	}

	/**
	 * Call check boolean.
	 *  Sprawdza czy wyliczanka nie jest pusta.
	 * @return the boolean
	 */
	@Override
	public boolean isEmpty() {
		return total == EMPTY;
	}

	/**
	 * Is full boolean.
	 *
	 * @return the boolean
	 */
	@Override
	public boolean isFull() {
		return total == CAPACITY;
	}

	/**
	 * Peekaboo int.
	 *  Zwraca wartość ostatniego elementu z tablicy.
	 * @return the int
	 */
	@Override
	public int peekaboo() {
		if (isEmpty())
			return EMPTY;
		return numbers[total - 1];
	}

	/**
	 * Count out int.
	 *  Usuwa ostatni element z tablicy i zwraca jego wartość
	 * @return the int
	 */
	@Override
	public int countOut() {
		if (isEmpty())
			return EMPTY;
		return numbers[--total];
	}

	/**
	 * Gets total.
	 *
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}
}
