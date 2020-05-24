package org.practice.easy;

//TODO Incorrect implementation. You need to do this using Recursion. No excuse
//https://leetcode.com/problems/power-of-two/

public class IsPowerOfTwo {
	
    public static boolean isPowerOfTwo(int n) {
        
        if (n == 1) return true;
        
       else if (n == 0) return true;
        else 
           return isPowerOfTwo(n/2);
        
    }

	public static void main(String[] args) {

		System.out.println(IsPowerOfTwo.isPowerOfTwo(15));
		
	}

}
