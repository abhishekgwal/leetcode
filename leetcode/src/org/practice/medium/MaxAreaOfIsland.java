package org.practice.medium;

/**
 * https://leetcode.com/problems/max-area-of-island/
 * https://www.youtube.com/watch?v=W8VuDt0eb5c
 *
 */

public class MaxAreaOfIsland {

	int maxIsland(int [][]grid) {
		
		int count = 0;
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				
				if (grid[i][j] == 1) {
				int area = dfs(grid, i ,j); 	
				count = Math.max(area, count);
				}
			}
		}
		return count;
	}
	
	private int dfs(int [][] grid, int row, int col) {
		
		if (row < 0 || row >= grid.length || col < 0 || col >= grid[row].length || grid[row][col] == 0)
			return 0;
		grid[row][col] = 0;
		
		return 1 + dfs(grid, row + 1, col) +
		dfs(grid, row - 1, col) +
		dfs(grid, row, col + 1) +
		dfs(grid, row, col - 1);
	}
	
	public static void main(String[] args) {

		MaxAreaOfIsland obj = new MaxAreaOfIsland();
		int grid[][] = {{1,1,0,0,0},
				 		{1,1,0,0,0},
				 		{0,0,1,0,0},	
				 		{0,0,0,1,1}};
		System.out.println(obj.maxIsland(grid));
	}
}
