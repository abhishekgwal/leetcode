package org.practice.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * https://leetcode.com/problems/single-number/
 *
 */
public class SingleNumber {

	private static int singleNumber (int [] nums) {
		
		Integer result = null;
		Arrays.sort(nums);
		Map<Integer, Integer> hm = new HashMap<>();
		
		for (int i : nums) {
			
			if (!hm.containsKey(i))
				hm.put(i, hm.get(i));
			else 
				hm.put(i, i);
			
		}
		
		for(Map.Entry<Integer, Integer> hashMap : hm.entrySet()) {
			
			Integer key = hashMap.getKey();
			Integer value = hashMap.getValue();
			
			if (null == value)
				result = key;
			
		}
			return result;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {1, 3, 1, -1, 3};
		int res = SingleNumber.singleNumber(nums);
		System.out.println(res);

	}

}
