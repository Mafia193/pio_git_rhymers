package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.IntArrayStackRhymersFactory;
import edu.kis.vh.nursery.factory.IntLinkedListRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

/**
 * The type Rhymers demo.
 */
class RhymersDemo {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		RhymersFactory defaultRhymersFactory = new DefaultRhymersFactory();
		RhymersFactory intArrayStackRhymersFactory = new IntArrayStackRhymersFactory();
		RhymersFactory intLinkedListRhymersFactory = new IntLinkedListRhymersFactory();

		System.out.println("DefaultRhymersFactory");
		testRhymers(defaultRhymersFactory);
		System.out.println("\nIntArrayStackRhymersFactory");
		testRhymers(intArrayStackRhymersFactory);
		System.out.println("\nIntLinkedListRhymersFactory");
		testRhymers(intLinkedListRhymersFactory);
	}

	private static void  testRhymers(RhymersFactory factory) {
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFifoRhymer(), factory.getHanoiRhymer()};

		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				rhymers[j].countIn(i);

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++)
			rhymers[3].countIn(rn.nextInt(20));

		for (int i = 0; i < rhymers.length; i++) {
			while (!rhymers[i].isEmpty())
				System.out.print(rhymers[i].countOut() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is "
				+ ((HanoiRhymer) rhymers[3]).reportRejected());
	}

}