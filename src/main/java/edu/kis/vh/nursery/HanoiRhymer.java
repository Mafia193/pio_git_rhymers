package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

  private static final int INT3 = 0;
	private int totalRejected = INT3;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}

// Kombinacja klawiszy alt + ← oraz alt + → przełącza nas między zakładkami projektu.
