package edu.kis.vh.nursery;

import edu.kis.vh.nursery.intlists.IntArrayStack;

/**
 * The type Fifo rhymer.
 */
public class FifoRhymer extends DefaultCountingOutRhymer {

	private final IntArrayStack stack = new IntArrayStack();

	public FifoRhymer() {
	}

	@Override
	public int pop() {
		while (!isEmpty())
			stack.push(super.pop());

		int ret = stack.pop();

		while (!stack.isEmpty())
			push(stack.pop());

		return ret;
	}
}
