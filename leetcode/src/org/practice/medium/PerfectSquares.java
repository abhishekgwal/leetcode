package org.practice.medium;
public class PerfectSquares {

	//https://leetcode.com/problems/perfect-squares/discuss/71632/Beautiful-8-Lines-Java-Solution
	
	public int numSquares(int n) {
            int[] dp = new int[n+1];
            
            for(int i=0;i<=n;i++){
            	
                dp[i] = i;
                for(int j=1; j * j <= i; j++){
                	dp[i] = Math.min(dp[i-j*j]+1,dp[i]);
                }
            }
            return dp[n];
        }
    	
    public static void main(String[] args){
    	
    	PerfectSquares obj = new PerfectSquares();
    	System.out.println(obj.numSquares(4));
    	
    }
}
