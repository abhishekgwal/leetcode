package org.practice.easy;

public class SplitStrings {
	
	boolean splitStrings(String s1, String s2) {
		
		boolean answer = false;
		for (int i = 1; i < s1.length(); i++) {
			answer = split(s1, s2, i);
			if (answer)
				return answer;
		}
		return answer;
	}

	private boolean split(String s1, String s2, int i) {

		String a1 = s1.substring(0, i);
		String a2 = s1.substring(i, s1.length());
		
		String b1 = s2.substring(0, i);
		String b2 = s2.substring(i, s2.length());
		
		if (isPalindrome(a1.concat(b2))) return true;
		if (isPalindrome(a2.concat(b1))) return true;
		
		return false;
	}

	private boolean isPalindrome(String s) {

		StringBuilder sb = new StringBuilder(s);
		String rev = sb.reverse().toString();
		if(rev.equals(s))
			return true;
		return false;
	}

	public static void main(String[] args) {

		SplitStrings obj = new SplitStrings();
		//System.out.println(obj.splitStrings("abcbbbb", "xxxbcba"));
		System.out.println(obj.splitStrings("abcxxxx", "xxxxiuba"));
		
	}

}
