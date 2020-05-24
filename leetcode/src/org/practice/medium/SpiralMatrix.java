package org.practice.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/spiral-matrix/ 
 *
 */
public class SpiralMatrix {

public List<Integer> spiralOrder(int[][] matrix) {
        
    	List<Integer> list = new ArrayList<>();
    	
        if (matrix.length == 0) return new ArrayList<Integer>();
        
        int top = 0, bottom = matrix.length - 1, right = matrix[0].length -1, left = 0, direction = 0;
    	
    	while(top <= bottom && left <= right) {
    		
    		// Left to Right
    		if (direction == 0) {
    		for (int i = left; i <= right; i++)
    			list.add(matrix[top][i]);
    			top++;
    		}
    		
    		//Top to Bottom
    		if (direction == 1) {
    		for (int i = top; i <= bottom; i++) 
    			list.add(matrix[i][right]);
    			right--;
    		}
    		
    		
    		//Right to Left
    		if (direction == 2) {
        		for (int i = right; i >= left; i--) 
        			list.add(matrix[bottom][i]);
        			bottom--;
        		}
    		
    		//Bottom to Top
    		if (direction == 3) {
        		for (int i = bottom; i >= top; i--) 
        			list.add(matrix[i][left]);
        			left++;
        		}
    		
    		direction = (direction + 1)%4;
    	}
    	return list;
    
    }
	
	public static void main(String[] args) {
		
		SpiralMatrix obj = new SpiralMatrix();
		
		int [][] matrix = {{ 1, 2, 3 },
						   { 4, 5, 6 },
						   { 7, 8, 9 },
						   };
		List<Integer> list = obj.spiralOrder(matrix);
		System.out.println(list);
	}
}
