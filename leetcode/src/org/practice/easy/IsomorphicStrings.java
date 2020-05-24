package org.practice.easy;

//https://leetcode.com/problems/isomorphic-strings/

public class IsomorphicStrings {

	    public boolean isIsomorphic(String s, String t) {
	    	
	        int arr1[] = new int[128];
	        int arr2[] = new int[128];
	        
	        for (int i = 0; i < s.length(); i++) {
	            if(arr1[s.charAt(i)] != arr2[t.charAt(i)]) 
	            	return false;
	            arr1[s.charAt(i)] = i + 1;
	            arr2[t.charAt(i)] = i + 1;
	        }
	        return true;
	    }
		
	public static void main(String[] args) {

		IsomorphicStrings obj = new IsomorphicStrings();
		String s = "paper", t = "title";
		System.out.println(obj.isIsomorphic(s, t));

	}
}
