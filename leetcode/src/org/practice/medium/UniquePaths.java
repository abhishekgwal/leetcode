package org.practice.medium;

/**
 * https://leetcode.com/problems/unique-paths/
 */
public class UniquePaths {
	
    public int uniquePaths(int m, int n) {
        
        int[][] grid = new int[n][m];
        
            for (int j = 0; j < m; j++) {
            	grid[0][j] = 1;
            }
        
           for(int i = 1; i < n; i++) {
        	   grid[i][0] = 1;
                   
           } 
        
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                grid[i][j] = grid[i-1][j] + grid[i][j-1];
            }
        }
        return grid[n-1][m-1];
    }

	public static void main(String[] args) {

		UniquePaths obj = new UniquePaths();
		System.out.println(obj.uniquePaths(7, 3));
		
	}
}
