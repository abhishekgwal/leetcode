package org.practice.easy;

public class FloodFill {

	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

		if(image[sr][sc] == newColor)
			return image;
		
		dfs(image, sr, sc, image[sr][sc], newColor);
			return image;
	}

	void dfs(int[][] image, int sr, int sc, int color, int newColor) {

		if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != color)
			return;

		image[sr][sc] = newColor;
		dfs(image, sr + 1, sc, color, newColor); // down
		dfs(image, sr, sc + 1, color, newColor); // right
		dfs(image, sr - 1, sc, color, newColor); // up
		dfs(image, sr, sc - 1, color, newColor); // left

	}

	public static void main(String[] args) {

		FloodFill obj = new FloodFill();
		int grid[][] = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };

		int res[][] = obj.floodFill(grid, 1, 1, 2);

		for (int row = 0; row < res.length; row++) {
			for (int col = 0; col < res[row].length; col++) {
				System.out.print(res[row][col] + " ");
			}
			System.out.println();
		}

	}

}
