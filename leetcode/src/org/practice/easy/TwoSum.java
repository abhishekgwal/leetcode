package org.practice.easy;

import java.util.HashMap;

/*
 * https://leetcode.com/problems/two-sum/solution/
 */

public class TwoSum {


	public int[] twoSum(int[] nums, int target) {
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for (int i = 0; i< nums.length; i++) {
			if (hm.containsKey(target - nums[i]))
				return new int[] {hm.get(target - nums[i]), i};
		
			hm.put(nums[i], i);
		}
		return null;
	}

	public static void main(String[] args) {

		int res[];
		TwoSum obj = new TwoSum();
		int nums[] = { 2, 7, 11, 15 };
		res = obj.twoSum(nums, 13);
		if (res != null) {
			for (int i : res)
				System.out.print(i + ", ");
		} else
			System.out.println("null");

	}
}
