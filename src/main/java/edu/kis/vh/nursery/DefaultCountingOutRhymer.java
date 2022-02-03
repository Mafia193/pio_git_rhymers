package edu.kis.vh.nursery;

/**
 * The type Default counting out rhymer.
 */
public class DefaultCountingOutRhymer implements IntBridge{

	IntArrayStack stack = new IntArrayStack();

	public DefaultCountingOutRhymer() { }

	@Override
	public void push(int in) {
		stack.push(in);
	}

	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	@Override
	public boolean isFull() {
		return stack.isFull();
	}

	@Override
	public int top() {
		return stack.top();
	}

	@Override
	public int pop() {
		return stack.pop();
	}

	public int[] getNumbers() {
		return stack.getNumbers();
	}

	public int getTotal() {
		return stack.getTotal();
	}
}
