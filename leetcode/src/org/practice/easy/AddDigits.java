package org.practice.easy;

/**
 * https://leetcode.com/problems/add-digits/
 */

public class AddDigits {
	
    public int addDigits(int num) {
    	
    	while(num/10 > 0)
    		num = (num % 10) + addDigits(num/10); 
    	return num;
    	
    }

	public static void main(String[] args) {

		AddDigits obj = new AddDigits();
		System.out.println(obj.addDigits(5975));
		
	}

}

/** Add digits of a number
   
    public int addDigits(int num) {
    	if (num == 0) return 0;
    	int sum = (num % 10) + addDigits(num/10);
    	return sum;
    }
*/