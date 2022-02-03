package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.IntBridge;

public class IntArrayStack implements IntBridge {

	/**
	 * The constant LAST_INDEX.
	 */
	public static final int LAST_INDEX = 11;
	/**
	 * The constant CAPACITY.
	 */
	public static final int CAPACITY = 12;
	private final int[] numbers = new int[CAPACITY];


	private int total = EMPTY;

	/**
	 * Count in.
	 *  Dodaje element do wyliczanki jeżeli nie jest pełna.
	 * @param in the in
	 */
	@Override
	public void push(int in) {
		if (!isFull())
			numbers[++total] = in;
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
		return total == LAST_INDEX;
	}

	/**
	 * Peekaboo int.
	 *  Zwraca wartość ostatniego elementu z tablicy.
	 * @return the int
	 */
	@Override
	public int top() {
		if (isEmpty())
			return EMPTY;
		return numbers[total];
	}

	/**
	 * Count out int.
	 *  Usuwa ostatni element z tablicy i zwraca jego wartość
	 * @return the int
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY;
		return numbers[total--];
	}

	/**
	 * Get numbers int [ ].
	 *
	 * @return the int [ ]
	 */
	public int[] getNumbers() {
		return numbers;
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
