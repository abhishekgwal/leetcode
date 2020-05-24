package org.practice.easy;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 *
 */

public class FirstUniqueCharacter {

    public int firstUniqChar(String s) {
    	
    	int[] ascii = new int[128];
    	
    	for (int i = 0; i < s.length(); i++) {
    		int ch = s.charAt(i);
    		ascii[ch]++;
    	}
    	
    	for (int i = 0; i < s.length(); i++) {
    		int ch = s.charAt(i);
    		if (ascii[ch] == 1)
    			return i;
    	}
    	return -1;
    }
	
	public static void main(String[] args) {
		
		FirstUniqueCharacter obj = new FirstUniqueCharacter();
		String s = "loetclode";
		
		System.out.println(obj.firstUniqChar(s));
		
	}

}
