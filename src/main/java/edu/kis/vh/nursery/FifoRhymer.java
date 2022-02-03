package edu.kis.vh.nursery;

/**
 * The type Fifo rhymer.
 */
public class FifoRhymer extends DefaultCountingOutRhymer {

	private final DefaultCountingOutRhymer defaultCountingOutRhymer = new DefaultCountingOutRhymer();

	@Override
	public int countOut() {
		while (!callCheck())
			defaultCountingOutRhymer.countIn(super.countOut());

		int ret = defaultCountingOutRhymer.countOut();

		while (!defaultCountingOutRhymer.callCheck())
			countIn(defaultCountingOutRhymer.countOut());

		return ret;
	}
}
