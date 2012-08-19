package com.tsystems.javaschool.tasks;

import java.util.Arrays;

/**
 * Testing of SubsequenceImpl. Outputs "true" in console if it is possible to
 * get a sequence which is equal to the first one by removing some elements from
 * the second one, otherwise - "false".
 */
public class Testing {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Subsequence s = new SubsequenceImpl();

		boolean b1 = s.find(Arrays.asList("A", "B", "C", "D"), Arrays.asList(
				"BD", "A", "ABC", "B", "M", "D", "M", "C", "DC", "D"));
		System.out.println(b1); // Result: true

		boolean b2 = s.find(Arrays.asList("A", 5454, "C", "D"),
				Arrays.asList(5678, "A", "AB", "B", "M", "D", "C", 5454, "D"));
		System.out.println(b2); // Result: false

		boolean b3 = s.find(null, Arrays.asList("A", 42, "C", null));
		System.out.println(b3); // Result: false

		boolean b4 = s.find(Arrays.asList(98, null, -56, "brr"), Arrays
				.asList("alpha", 98, "beta", "gamma", null, 849, -87, -56,
						"shh", "brr"));
		System.out.println(b4); // Result: true
	}

}
