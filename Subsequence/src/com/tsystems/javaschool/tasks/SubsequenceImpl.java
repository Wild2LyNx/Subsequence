package com.tsystems.javaschool.tasks;

import java.util.List;

public class SubsequenceImpl implements Subsequence {

	/*
	 * @see com.tsystems.javaschool.tasks.Subsequence#find(java.util.List,
	 * java.util.List)
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public boolean find(List x, List y) {
		if (x.size() > y.size())
			return false;
		int j = 0;
		for (int i = 0; i < y.size(); i++) {
			if ((j < x.size()) && (x.get(j).equals(y.get(i))))
				j++;
		}
		if (j == x.size())
			return true;
		else
			return false;
	}

}
