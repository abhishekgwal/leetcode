package org.practice.easy;

//https://www.youtube.com/watch?v=1YQmI7F9dJ0
public class LongestCommonPrefix3 {

	public static String longestCommonPrefix(String[] strs) {
		
		String longestCommonPrefix = "";
		
		int index = 0;
		for(char c : strs[0].toCharArray()) {
			for (int i = 1; i < strs.length; i++) {
				if (index >= strs[i].length() || c != strs[i].charAt(index))
					return longestCommonPrefix;
			}
		longestCommonPrefix += c;
		index++;
		
		}
		return longestCommonPrefix;
	}
	
	public static void main(String[] args) {

		String[] arr = {"salim","salman","sam", "samosa", "santonio"};
		System.out.println(LongestCommonPrefix3.longestCommonPrefix(arr));
	}
}
