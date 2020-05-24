package org.practice.easy;
import java.util.Arrays;


//https://leetcode.com/problems/longest-common-prefix/discuss/6924/Sorted-the-array-Java-solution-2-ms
public class LongestCommonPrefixEasySolution {
	
    public static String longestCommonPrefix(String[] strs) {
    	
        if (strs.length == 0 || strs == null) return "";
        String lcp = "";
        Arrays.sort(strs);
        char[] a = strs[0].toCharArray();
        char[] b = strs[strs.length - 1].toCharArray();
    
     for (int i = 0; i < b.length; i++) {
          if(a.length > i && a[i] == b[i])
            lcp += b[i];
          else return lcp;
        }
      return lcp; 
    }

	public static void main(String[] args) {

		String[] strs = {"aa", "a"};
		System.out.println(LongestCommonPrefixEasySolution.longestCommonPrefix(strs));
		
		

	}
}
