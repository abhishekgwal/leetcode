package org.practice.medium;

public class DecodeWaysRecursion {

	//https://www.youtube.com/watch?v=qli-JCrSwuk&t=
	//https://leetcode.com/problems/decode-ways/
	
	int numWays(String s) {
		return helper(s, s.length());
	}
	
	int helper(String s, int k) {
		if (k == 0)
			return 1;
		
		int index = s.length() - k;
		if (s.charAt(index) == '0')
			return 0;
		
		int result = helper(s, k-1);
		
		if (k >= 2 && Integer.valueOf(s.substring(index, index+2)) <= 26) {
			result = result + helper(s, k-2); 
		}
		return result;
	}

	public static void main(String[] args) {

		String s = "2263";
		DecodeWaysRecursion obj = new DecodeWaysRecursion();
		int ans = obj.numWays(s);
		System.out.print(ans);

	}

}
