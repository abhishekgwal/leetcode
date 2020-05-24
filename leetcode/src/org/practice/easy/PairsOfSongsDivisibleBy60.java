package org.practice.easy;

public class PairsOfSongsDivisibleBy60 {
	
    public int numPairsDivisibleBy60(int[] time) {
        int c[]  = new int[60], res = 0;
        for (int t : time) {
            res = res + c[(600 - t) % 60];
            c[t % 60] = c[t % 60] + 1;
        }
        return res;
    }
	
	public static void main(String[] args) {
		
		PairsOfSongsDivisibleBy60 obj = new PairsOfSongsDivisibleBy60();
		int[] time = {33, 20, 147, 100, 40};
		System.out.println(obj.numPairsDivisibleBy60(time));
		
	}
}
