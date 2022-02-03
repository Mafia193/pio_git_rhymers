package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int EMPTY = -1;
	public static final int LAST_INDEX = 11;
	public static final int CAPACITY = 12;
	private final int[] numbers = new int[CAPACITY];

	private int total = EMPTY;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY;
	}

	public boolean isFull() {
		return total == LAST_INDEX;
	}

	protected int peekaboo() {
		if (callCheck())
			return EMPTY;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return EMPTY;
		return numbers[total--];
	}

	public int[] getNumbers() {
		return numbers;
	}

	public int getTotal() {
		return total;
	}
}
