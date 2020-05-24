package org.practice.easy;

/**
 * https://leetcode.com/problems/house-robber/solution/
 * 
 * f(i) = max(f(i – 2) + Ai, f(i – 1))
 * 
 * where :
 * f(i) = Largest amount that you can rob from the i houses.
   Ai = Amount of money at the ith house.
 */

public class HouseRobber {
	
    
    //Using DP
	public int rob(int[] nums) {
		
        if (nums.length == 0)
            return 0;
        
        if (nums.length == 1)
            return nums[0];
        
        if (nums.length == 2)
            return Math.max(nums[0], nums[1]);
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        
        for (int i = 2; i < nums.length; i++) {
            
            dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);
            
        }
        return dp[nums.length-1];
		
	}
	
	public static void main(String[] args) {

		HouseRobber obj = new HouseRobber();
		int[] nums = {1,0,3,9};
		System.out.println(obj.rob(nums));
		
	}
}