package cn.hackcoder;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 380. Insert Delete GetRandom O(1)
 */
public class InsertDeleteGetRandom {

	Set<Integer> sets = new HashSet<Integer>();

	/**
	 * Initialize your data structure here.
	 */
	public InsertDeleteGetRandom() {

	}

	/**
	 * Inserts a value to the set. Returns true if the set did not already contain the specified element.
	 */
	public boolean insert(int val) {
		return sets.add(val);
	}

	/**
	 * Removes a value from the set. Returns true if the set contained the specified element.
	 */
	public boolean remove(int val) {
		return sets.remove(val);
	}

	/**
	 * Get a random element from the set.
	 */
	public int getRandom() {
		int random = new Random().nextInt(sets.size());
		return sets.toArray(new Integer[0])[random];
	}
}
