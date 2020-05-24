package org.practice.medium;

public class NoOfIslands {

	public int numIslands(char[][] grid) {

		int count = 0;
		if (grid == null || grid.length == 0)
			return 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {

				if (grid[i][j] == '1') {
					count = dfs(grid, i, j) + count;
				}
			}
		}
		return count;
	}

	private int dfs(char[][] grid, int row, int col) {

		if (row < 0 || row >= grid.length || col < 0 || col >= grid[row].length || grid[row][col] == '0') {
			return 0;
		}

		grid[row][col] = '0';
		dfs(grid, row, col + 1); // right
		dfs(grid, row, col - 1); // left
		dfs(grid, row + 1, col); // down
		dfs(grid, row - 1, col); // up

		return 1;
	}

	public static void main(String[] args) {
		
		NoOfIslands obj = new NoOfIslands();
		char grid[][] = {{'1','1','0','0','0'},
						 {'1','1','0','0','0'},
						 {'0','0','1','0','0'},	
						 {'0','0','0','1','1'}};
		
		System.out.println(obj.numIslands(grid));
	}
}
