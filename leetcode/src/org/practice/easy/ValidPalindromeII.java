package org.practice.easy;

//https://www.youtube.com/watch?v=WQTZQ6LHm0M
//https://leetcode.com/problems/valid-palindrome-ii/

public class ValidPalindromeII {

	boolean validPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		
		while(i <= j) {
			if (s.charAt(i) != s.charAt(j)) {
				return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j-1);  
			}
			i++;
			j--;
		}
		return true;
	}
	
	boolean isPalindrome(String s, int i, int j) {
		while(i <= j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;  
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		
		ValidPalindromeII obj = new ValidPalindromeII();
		System.out.println(obj.validPalindrome("abca"));
	}
}
