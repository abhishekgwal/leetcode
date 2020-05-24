package org.practice.medium;

/*
 * https://leetcode.com/problems/unique-paths-ii/
 * https://www.youtube.com/watch?v=AmRvCR6B5no&t=805s
 */
public class UniquePathsII {
	
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
		 int row = obstacleGrid.length;
	     int col = obstacleGrid[0].length;
	     int[][] finalGrid = new int[row][col];
	     
	     	//First row
	        for (int j = 0; j < col; j++) {
	           	if (obstacleGrid[0][j] == 1) {
	           		finalGrid[0][j] = 0;
	                break;
	                }
	            else finalGrid[0][j] = 1;
	        }

	     	//First col
	        for (int i = 0; i < row; i++) {
	           	if (obstacleGrid[i][0] == 1) {
	           		finalGrid[i][0] = 0;
	                break;
	                }
	            else finalGrid[i][0] = 1;
	        }
	        
	        for (int i = 1; i < obstacleGrid.length; i++) {
	            for (int j = 1; j < obstacleGrid[i].length; j++) {
	                
	                if (obstacleGrid[i][j] == 0)
	                	finalGrid[i][j] = finalGrid[i-1][j] + finalGrid[i][j-1];
	            }
	        }
	        return finalGrid[row-1][col-1];
		
    }
	
	public static void main(String[] args) {
		
		UniquePathsII obj = new UniquePathsII();
		int[][] grid = {{0,0,0},
						{0,1,0},
						{0,0,0}};
		
		System.out.println(obj.uniquePathsWithObstacles(grid));
		
	}
}
