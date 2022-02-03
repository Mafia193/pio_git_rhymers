package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

/**
 * The interface Rhymers factory.
 */
public interface RhymersFactory {

	/**
	 * Gets standard rhymer.
	 *
	 * @return the standard rhymer
	 */
	DefaultCountingOutRhymer getStandardRhymer();

	/**
	 * Gets false rhymer.
	 *
	 * @return the false rhymer
	 */
	DefaultCountingOutRhymer getFalseRhymer();

	/**
	 * Gets fifo rhymer.
	 *
	 * @return the fifo rhymer
	 */
	DefaultCountingOutRhymer getFifoRhymer();

	/**
	 * Gets hanoi rhymer.
	 *
	 * @return the hanoi rhymer
	 */
	DefaultCountingOutRhymer getHanoiRhymer();

}
