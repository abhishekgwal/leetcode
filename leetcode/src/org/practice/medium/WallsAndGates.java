package org.practice.medium;

/**
 *	https://leetcode.com/problems/walls-and-gates/ 
 */

public class WallsAndGates {

	public void wallsAndGates (int[][] rooms) {
		
		for (int row = 0; row < rooms.length; row++) {
			for (int col = 0; col < rooms[row].length; col++) {
				
				if (rooms[row][col] == 0)
					dfs(rooms, row, col, 0);
				
			}
		}
		
	}
	
	public void dfs(int[][] rooms, int row, int col, int count) {
		
		if (row < 0 || row >= rooms.length || col < 0 || col >=rooms[row].length || rooms[row][col] < count) 
			return;
			
			rooms[row][col] = count;
			
			dfs(rooms, row + 1, col, count + 1); //Down
			dfs(rooms, row - 1, col, count + 1); // Up
			dfs(rooms, row, col + 1 , count + 1); // Right
			dfs(rooms, row, col - 1, count + 1); // Left
			
	}
	
	public static void main(String[] args) {

		WallsAndGates obj = new WallsAndGates();
		
		int grid[][] = {{99,-1,0,99},
						{99,99,99,-1},
						{99,-1,99,-1},	
						{0,-1,99,99}};
		
		obj.wallsAndGates(grid);
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j <grid[i].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}

}
