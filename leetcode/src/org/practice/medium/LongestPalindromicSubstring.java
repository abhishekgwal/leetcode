package org.practice.medium;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/
 * https://www.youtube.com/watch?v=0xeBqanD5GQ
 *
 */

public class LongestPalindromicSubstring {

	public static String longestPalindrome (String s) {
		
		int len = s.length(), left = 0, right = 0;
		
		if (s == null || len < 2) return s;
		
		boolean[][] isPalindrome = new boolean [len][len];
		
		for (int j = 1; j < len; j++) {
			for (int i = 0; i < j; i++) {
				
				boolean isInnerWordPalindrome = isPalindrome[i + 1][j - 1] || j - i <= 2;
				
				if (s.charAt(i) == s.charAt(j) && isInnerWordPalindrome) {
					isPalindrome[i][j] = true;
					
					if (j - i > right - left) {
						left = i;
						right = j;
					}
				}
			}
		}
		
		for (int i = 0; i < isPalindrome.length; i++ ) {
			for (int j = 0; j < isPalindrome[i].length; j++) {
				System.out.print(isPalindrome[i][j] + " ");
			}
			System.out.println();
		}

		return s.substring(left, right + 1);
		
	}
	
	public static void main(String[] args) {

		System.out.println(LongestPalindromicSubstring.longestPalindrome("babad"));
		
	}
}
