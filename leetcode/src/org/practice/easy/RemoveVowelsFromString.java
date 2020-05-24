package org.practice.easy;

/**
 * https://leetcode.com/problems/remove-vowels-from-a-string
 */
public class RemoveVowelsFromString {

    public static String removeVowels(String S) {
        return S.replaceAll("[aeiou]", "");
    }
	
	public static void main(String[] args) {
		
		String s = "leetcodeisacommunityforcoders";
		System.out.println(RemoveVowelsFromString.removeVowels(s));
		
	}
}


//My boring answer

/**
 *     public String removeVowels(String S) {
        
        String ans = "";
        for (int i = 0; i < S.length(); i++) {
            
            char ch = S.charAt(i);
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                continue;
            else
                ans = ans + ch;
        }
        return ans;
        
    }
 * 
 */