package edu.kis.vh.nursery;

/**
 * The type Hanoi rhymer.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int INT3 = 0;
	private int totalRejected = INT3;

	/**
	 * Report rejected int.
	 *
	 * @return the int
	 */
	public int reportRejected() {
		return totalRejected;
	}

	public HanoiRhymer() {
		super();
	}

	public HanoiRhymer(IntStack stack){
		super(stack);
	}

	@Override
	public void countIn(int in) {
		if (!isEmpty() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}

// Kombinacja klawiszy alt + ← oraz alt + → przełącza nas między zakładkami projektu.
