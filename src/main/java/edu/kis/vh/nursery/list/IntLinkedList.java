package edu.kis.vh.nursery.list;

/**
 * The type Int linked list.
 */
public class IntLinkedList {

  private static final int INT = -1;
	private Node last;
	private int i;  // TODO: Usunąć zbędną zmienną

	/**
	 * Push.
	 *  Dodaje element to listy.
	 * @param i the
	 */
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	/**
	 * Is empty boolean.
	 *  Sprawdza czy lista jest pusta.
	 * @return the boolean
	 */
	public boolean isEmpty() {
		return last == null;
	}

	/**
	 * Is full boolean.
	 *  Sprawdza czy lista jest pełna.
	 * @return the boolean
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * Top int.
	 *  Pobiera wartość ostatniego elementu z listy.
	 * @return the int
	 */
	public int top() {
		if (isEmpty())
			return INT;
		return last.getValue();
	}

	/**
	 * Pop int.
	 *  ściąga ostatni element z listy i zwraca jego wartość.
	 * @return the int
	 */
	public int pop() {
		if (isEmpty())
			return INT;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	private class Node {

		private int value;
		private Node prev;
		private Node next;

		/**
		 * Instantiates a new Node.
		 *
		 * @param i the
		 */
		public Node(int i) {
			setValue(i);
		}

		/**
		 * Gets value.
		 *
		 * @return the value
		 */
		public int getValue() {
			return value;
		}

		/**
		 * Sets value.
		 *
		 * @param value the value
		 */
		public void setValue(int value) {
			this.value = value;
		}

		/**
		 * Gets prev.
		 *
		 * @return the prev
		 */
		public Node getPrev() {
			return prev;
		}

		/**
		 * Sets prev.
		 *
		 * @param prev the prev
		 */
		public void setPrev(Node prev) {
			this.prev = prev;
		}

		/**
		 * Gets next.
		 *
		 * @return the next
		 */
		public Node getNext() {
			return next;
		}

		/**
		 * Sets next.
		 *
		 * @param next the next
		 */
		public void setNext(Node next) {
			this.next = next;
		}
	}
}
