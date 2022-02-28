package edu.kis.vh.nursery;

import edu.kis.vh.nursery.intlists.IntArrayStack;

/**
 * The type Fifo rhymer.
 */
public class FifoRhymer extends DefaultCountingOutRhymer {

	private IntStack fifoStack = new IntArrayStack();

	public FifoRhymer(){
		super();
	}

	public FifoRhymer(IntStack stack){
		super(stack);
	}

	@Override
	public int countOut() {
		while (!isEmpty())
			fifoStack.countIn(super.countOut());

		int ret = fifoStack.countOut();

		while (!fifoStack.isEmpty())
			countIn(fifoStack.countOut());

		return ret;
	}
}
