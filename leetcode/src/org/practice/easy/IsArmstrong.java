package org.practice.easy;

/**
 * https://leetcode.com/problems/armstrong-number/ 
 */
public class IsArmstrong {
	
    public static boolean isArmstrong(int N) {
        int count = 0, aStrong = 0, a = N, div = N, ansCheck = N;
        while (N > 0) {
            N /= 10;
            count++;
        }
        while(div > 0) {
            a = div % 10;
            aStrong += Math.pow(a, count);
            div = div / 10;
        }
        return (aStrong == ansCheck);
    }

	public static void main(String[] args) {

		System.out.println(IsArmstrong.isArmstrong(123));
	}
}
