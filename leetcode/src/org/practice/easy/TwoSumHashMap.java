package org.practice.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSumHashMap {

	public int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i);
	    }
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement) && map.get(complement) != i) {
	            return new int[] { i, map.get(complement) };
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	
	public static void main(String[] args) {
		
		int res[];
		TwoSumHashMap obj = new TwoSumHashMap();
		int nums[] = {2, 7, 11, 4, 9};
		res = obj.twoSum(nums, 22);
		for(int i: res)
		System.out.print(i + ", ");
	}

}
