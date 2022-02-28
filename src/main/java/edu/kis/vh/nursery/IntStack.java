package edu.kis.vh.nursery;

public interface IntStack {
	/**
	 * The constant EMPTY.
	 */
	int EMPTY = 0;

	void countIn(int in);

	boolean isEmpty();

	boolean isFull();

	int peekaboo();

	int countOut();
}
