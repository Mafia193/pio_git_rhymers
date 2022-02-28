package edu.kis.vh.nursery;

public interface IntBridge {
	/**
	 * The constant EMPTY.
	 */
	int EMPTY = 0;

	void push(int in);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();
}
