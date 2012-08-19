package com.tsystems.javaschool.tasks;

import java.util.List;

/**
 * Checks if it is possible to get a sequence which is equal to the first one by
 * removing some elements from the second one.
 * 
 * If one of the two sequences is null, and the second - not null, then it
 * returns false.
 * 
 * @param x
 *            first sequence
 * @param y
 *            second sequence
 * @return <code>true</code> if possible, otherwise <code>false</code>
 * 
 * @see com.tsystems.javaschool.tasks.Subsequence#find(java.util.List,
 *      java.util.List)
 */

public class SubsequenceImpl implements Subsequence {

	@Override
	@SuppressWarnings("rawtypes")
	public boolean find(List x, List y) {
		if ((x == null) | (y == null))
			return false;
		if (x.size() > y.size())
			return false;
		int j = 0; //counter for elements of first sequence 
		for (int i = 0; i < y.size(); i++) {
			if ((j < x.size())) {
				if ((x.get(j) == null) && (y.get(i) == null))
					j++;
				else if (x.get(j) != null) {
					if (x.get(j).equals(y.get(i)))
						j++;
				}

			}
		}
		if (j == x.size())
			return true;
		else
			return false;
	}
}
