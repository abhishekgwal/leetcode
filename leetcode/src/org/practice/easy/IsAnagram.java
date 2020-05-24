package org.practice.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/valid-anagram/
 */
public class IsAnagram {

	public boolean isAnagram(String s, String t) {
		
		char[] s_char = s.toCharArray();
		char[] t_char = s.toCharArray();
		
		Arrays.sort(s_char);
		Arrays.sort(t_char);
		
		return Arrays.equals(s_char, t_char);
    
    }
	
	public static void main(String[] args) {
		
		IsAnagram obj = new IsAnagram();
		String s = "a";
		String t = "b";
		
		System.out.println(obj.isAnagram(s, t));
		
	}

}
