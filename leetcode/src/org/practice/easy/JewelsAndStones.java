package org.practice.easy;

import java.util.HashSet;
import java.util.Set;

/**
 *	https://leetcode.com/problems/jewels-and-stones/ 
 */
public class JewelsAndStones {
	
    public static int numJewelsInStones(String J, String S) {
        
        int count = 0;
        Set<Character> jewelSet = new HashSet<>();
        
        for (int i = 0; i < J.length(); i++)
            jewelSet.add(J.charAt(i));
        
        for (int i = 0; i < S.length(); i++) {
            
            char ch = S.charAt(i);
            if (jewelSet.contains(ch))
                count++;
        }
        
        return count;
    }

	public static void main(String[] args) {

		System.out.println(JewelsAndStones.numJewelsInStones("aA", "aAAbbbb"));
		
	}

}
