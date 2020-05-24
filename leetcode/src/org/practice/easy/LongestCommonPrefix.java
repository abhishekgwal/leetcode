package org.practice.easy;

/**
 * https://www.youtube.com/watch?v=Tj0VRPcj8pQ
 * https://leetcode.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        
        if (strs == null || strs.length == 0)
            return "";
           
       String lcp = strs[0];
           
        for (int i = 1; i < strs.length; i++) {
            
           int count = 0; 
           String currentString = strs[i];
           
            while(count < lcp.length() && count < currentString.length() && 
                  lcp.charAt(count) == currentString.charAt(count))
                count++;
            
            lcp = lcp.substring(0, count);
          }   
           
          return lcp; 
       }
	
	public static void main(String[] args) {
		
		LongestCommonPrefix obj = new LongestCommonPrefix();
		String[] arr = {"flower","flow","flight"};
		System.out.println(obj.longestCommonPrefix(arr));

	}

}
