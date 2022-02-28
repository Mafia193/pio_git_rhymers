package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FifoRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.intlists.IntArrayStack;
import edu.kis.vh.nursery.intlists.IntLinkedList;

public class IntLinkedListRhymersFactory implements RhymersFactory {

	@Override
	public DefaultCountingOutRhymer getStandardRhymer() {
		return new DefaultCountingOutRhymer(new IntLinkedList());
	}

	@Override
	public DefaultCountingOutRhymer getFalseRhymer() {
		return new DefaultCountingOutRhymer(new IntArrayStack());
	}

	@Override
	public DefaultCountingOutRhymer getFifoRhymer() {
		return new FifoRhymer(new IntLinkedList());
	}

	@Override
	public DefaultCountingOutRhymer getHanoiRhymer() {
		return new HanoiRhymer(new IntLinkedList());
	}
}
