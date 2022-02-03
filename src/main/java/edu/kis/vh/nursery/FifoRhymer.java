package edu.kis.vh.nursery;

/**
 * The type Fifo rhymer.
 */
public class FifoRhymer extends DefaultCountingOutRhymer {

	private final DefaultCountingOutRhymer defaultCountingOutRhymer = new DefaultCountingOutRhymer();

	@Override
	public int pop() {
		while (!isEmpty())
			defaultCountingOutRhymer.push(super.pop());

		int ret = defaultCountingOutRhymer.pop();

		while (!defaultCountingOutRhymer.isEmpty())
			push(defaultCountingOutRhymer.pop());

		return ret;
	}
}
