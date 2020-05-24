package org.practice.easy;

public class ReverseInteger {

	static int rev(int n) {
		
		long reversed = 0;
		while(n != 0) {
			int digit = n % 10;
			reversed = reversed * 10 + digit;
			n /= 10;
		}
		return (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) ? 0 : (int) reversed;
	}
	
	public static void main(String[] args) {
		
		System.out.println(ReverseInteger.rev(1534236469));
											//9646324351 - Reverse of original number but it is greater than Integer.MAX_VALUE so 
											// expected output is 0
											//2147483647 = Integer.MAX_VALUE	
	}

}
