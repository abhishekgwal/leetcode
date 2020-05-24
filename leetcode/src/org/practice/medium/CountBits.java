package org.practice.medium;

/**
 * https://leetcode.com/problems/counting-bits/
 */
public class CountBits {

	 public static int[] countBits(int num) {
		 
				if (num == 0) {
				return new int[1];
				}
				
			    int[] dp = new int[num+1];
			    dp[1] = 1;
				
			    for (int i = 1 ; i < dp.length; i++) {
			        dp[i] = dp[i/2] + dp[i%2];
			    }
				
			    return dp;
			}
		 
	public static void main(String[] args) {
		
		int[] ans = countBits(5);
		
		for(int i : ans)
			System.out.print(i+ " ");
	}

}
