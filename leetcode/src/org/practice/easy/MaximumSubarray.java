package org.practice.easy;

/**
 * https://leetcode.com/problems/maximum-subarray/

 * https://www.youtube.com/watch?v=qX6U6--RL74
 */

public class MaximumSubarray {
	
    public int maxSubArray(int[] nums) {

        int sumTillNow = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            
            sumTillNow += nums[i];
    
            if (sumTillNow > maxSum)
                maxSum = sumTillNow;
            
            if (sumTillNow < 0)
                sumTillNow = 0;
            
        }
        return maxSum;        
    }

	public static void main(String[] args) {

		MaximumSubarray obj = new MaximumSubarray();
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(obj.maxSubArray(nums));
	}
}
