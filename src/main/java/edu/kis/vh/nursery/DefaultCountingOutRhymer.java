package edu.kis.vh.nursery;

/**
 * The type Default counting out rhymer.
 */
public class DefaultCountingOutRhymer {

	IntArrayStack stack = new IntArrayStack();

	public DefaultCountingOutRhymer() { }

	public void countIn(int in) {
		stack.countIn(in);
	}

	public boolean callCheck() {
		return stack.callCheck();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int peekaboo() {
		return stack.peekaboo();
	}

	public int countOut() {
		return stack.countOut();
	}

	public int[] getNumbers() {
		return stack.getNumbers();
	}

	public int getTotal() {
		return stack.getTotal();
	}
}
