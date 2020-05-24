package org.practice.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        
        int slow = 0, fast = 0, max = 0;
        Set<Character> set = new HashSet<>();
        while(fast < s.length()) {
            if (!set.contains(s.charAt(fast))) {
                set.add(s.charAt(fast));
                fast = fast + 1;
                max = Math.max(max, fast - slow);
            }
            else {
                set.remove(s.charAt(slow));
                slow = slow + 1;
            }
        }
        return max;
    }
	
	public static void main(String[] args) {

		LongestSubstringWithoutRepeatingCharacters obj = new LongestSubstringWithoutRepeatingCharacters();
		System.out.println(obj.lengthOfLongestSubstring("abcabcdbb"));
		
	}

}
