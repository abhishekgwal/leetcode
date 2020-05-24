package org.practice.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Q - 229. LeetCode Majority Element II

public class MajorityElement {

	public List<Integer> majorityElement(int[] nums) {

		int occur = (int) Math.floor(nums.length / 3);
		Map<Integer, Integer> hm = new HashMap<>();
		List<Integer> list = new ArrayList<>();

		for (int i : nums) {

			if (hm.containsKey(i))
				hm.put(i, hm.get(i) + 1);
			else
				hm.put(i, 1);
		}

		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {

			Integer key = entry.getKey();
			Integer value = entry.getValue();

			if (value > occur)
				list.add(key);
		}
		return list;
	}

	public static void main(String[] args) {

		MajorityElement obj = new MajorityElement();
		int[] nums = {1,1,1,3,3,2,2,2};
		List<Integer> result = obj.majorityElement(nums);
		System.out.println(result);
		
	}
}
