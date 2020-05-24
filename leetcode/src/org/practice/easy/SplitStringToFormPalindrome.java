package org.practice.easy;

/**
 * 
 * https://leetcode.com/discuss/interview-question/306859/Google-phone-screen-Split-strings-to-form-a-palindrome
 * There is a slight change in my solution. I am returning the index where the split happens.
 */
public class SplitStringToFormPalindrome {

	static int splitPalindrome(String s1, String s2) {

		if (s1 == null || s2 == null || s1.length() == 0 || s2.length() == 0 || s1.length() != s2.length())
			return -1;
		int c = 1;
		for (int i = 0; i < s1.length(); i++) {

			int j = i;
			String firstHalfS1 = s1.substring(0, c);
			String secondHalfS2 = s2.substring(++j, s2.length());

			if (isPalindrome(firstHalfS1 + secondHalfS2))
				return c;
			c++;
		}
		return -1;
	}

	static boolean isPalindrome(String s) {

		StringBuilder sb = new StringBuilder(s);
		if (sb.reverse().toString().equals(s))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		String s1 = "taspq";
		String s2 = "sxpat";

		System.out.print(splitPalindrome(s1, s2));
	}
}
