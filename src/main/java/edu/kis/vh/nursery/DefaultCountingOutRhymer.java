package edu.kis.vh.nursery;

import edu.kis.vh.nursery.intlists.IntArrayStack;

/**
 * The type Default counting out rhymer.
 */
public class DefaultCountingOutRhymer {

	private IntStack stack;

	public DefaultCountingOutRhymer() {
		stack = new IntArrayStack();
	}

	public DefaultCountingOutRhymer(IntStack stack) {
		this.stack = stack;
	}

	public void countIn(int in) {
		if(!isFull())
			stack.countIn(in);
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	protected int peekaboo() {
		return stack.peekaboo();
	}

	public int countOut() {
		return stack.countOut();
	}
}
