package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int INT = -1;
	public static final int INT1 = 11;
	public static final int INT2 = 12;
	private final int[] numbers = new int[INT2];

	private int total = INT;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == INT;
	}

	public boolean isFull() {
		return total == INT1;
	}

	protected int peekaboo() {
		if (callCheck())
			return INT;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return INT;
		return numbers[total--];
	}

	public int[] getNumbers() {
		return numbers;
	}

	public int getTotal() {
		return total;
	}
}
