package org.practice.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/move-zeroes/
 */
public class MoveZerosToEnd {

	void moveZeros(int[] nums) {

		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			
			//Place all the non zero elements first in the array
			if (nums[i] != 0)
				nums[index++] = nums[i];

		}
		//Place all the zeros at the end.
		Arrays.fill(nums, index, nums.length, 0);
	}

	public static void main(String[] args) {
		
		int[] nums = {0,1,0,3,12};
		
		MoveZerosToEnd obj = new MoveZerosToEnd();
		obj.moveZeros(nums);
		
		for (int i : nums)
			System.out.print(i + " ");
	}
}
