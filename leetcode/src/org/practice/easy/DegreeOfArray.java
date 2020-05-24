package org.practice.easy;

import java.util.HashMap;
import java.util.Map;

public class DegreeOfArray {
	
	public static int findShortestArray(int[] nums) {
		Map<Integer, Integer> count = new HashMap<>();
		int degree = 0;
		
		Map<Integer, Integer> first_seen = new HashMap<>();
		int min = 0;
		
		for (int i = 0; i < nums.length; i++) {
			first_seen.putIfAbsent(nums[i], i);
			count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
			if (count.get(nums[i]) > degree) {
				degree = count.get(nums[i]);
				min = i - first_seen.get(nums[i]) + 1;
			}
				else if (count.get(nums[i]) == degree) {
					min = Math.min(min, i - first_seen.get(nums[i]) + 1);
				}
			}
		return min;
		}

	public static void main(String[] args) {

		int[] nums = {1,2,2,3,1,4,2};
		System.out.println(DegreeOfArray.findShortestArray(nums));
	}
}
