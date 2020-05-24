package org.practice.easy;

public class MaximalSquare {
	
	public int maximalSquare (char[][] matrix) {
		
		char[][] dup = new char[matrix.length][matrix[0].length];
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				
				if (matrix[row][col] == '1') {
					dup = findMin(matrix, row, col);
				}
				else {
					dup[row][col] = '0';
				}
			}
		}
		return 0;
		
	}

	char[][] findMin(char[][] matrix, int r, int c) {
		
		if (r == 0 || c == 0) {
			
		}
		
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
