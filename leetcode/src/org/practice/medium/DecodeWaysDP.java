package org.practice.medium;

public class DecodeWaysDP {

	int numWays(String s) {
		int[] dp = new int[s.length() + 1]; 
		return helper(s, s.length(), dp);
	}
	
	int helper(String s, int k, int[] dp) {
		if (k == 0)
			return 1;
		
		int index = s.length() - k;
		if (s.charAt(index) == '0')
			return 0;
		
		int result = helper(s, k-1, dp);
		
		if (k >= 2 && Integer.valueOf(s.substring(index, index+2)) <= 26) {
			result = result + helper(s, k-2, dp); 
		}
		return result;
	}
	
	public static void main(String[] args) {

		String s = "2263";
		DecodeWaysDP obj = new DecodeWaysDP();
		int ans = obj.numWays(s);
		System.out.print(ans);
		
	}

}
