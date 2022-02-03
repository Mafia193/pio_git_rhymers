package edu.kis.vh.nursery;

public class IntArrayStack {

	/**
	 * The constant EMPTY.
	 */
	public static final int EMPTY = -1;
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
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/**
	 * Call check boolean.
	 *  Sprawdza czy wyliczanka nie jest pusta.
	 * @return the boolean
	 */
	public boolean callCheck() {
		return total == EMPTY;
	}   // TODO: Zmienić nazwę funkcji

	/**
	 * Is full boolean.
	 *
	 * @return the boolean
	 */
	public boolean isFull() {
		return total == LAST_INDEX;
	}

	/**
	 * Peekaboo int.
	 *  Zwraca wartość ostatniego elementu z tablicy.
	 * @return the int
	 */
	protected int peekaboo() {
		if (callCheck())
			return EMPTY;
		return numbers[total];
	}

	/**
	 * Count out int.
	 *  Usuwa ostatni element z tablicy i zwraca jego wartość
	 * @return the int
	 */
	public int countOut() {
		if (callCheck())
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
