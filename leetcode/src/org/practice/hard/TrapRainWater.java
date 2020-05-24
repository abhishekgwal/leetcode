package org.practice.hard;

/**
 * https://leetcode.com/problems/trapping-rain-water
 */
public class TrapRainWater {

	public static int trap(int[] height) {
        
        if (height.length == 0 || height == null) return 0;
        
        int trapWater = 0;
        int[] leftHighest = new int[height.length + 1];
        
        for(int i = 0; i < height.length; i++) 
            leftHighest[i+1] = Math.max(leftHighest[i],height[i]);
        
        int[] rightHighest = new int[height.length + 1];
        for (int i = height.length; i > 0; i--) 
            rightHighest[i-1] = Math.max(rightHighest[i], height[i-1]);
        
        for (int i = 0; i < height.length; i++) {
        	
        	int min = Math.min(leftHighest[i], rightHighest[i]) - height[i];
        	if(min > 0)
        		trapWater += min;
        	
        }
        
        return trapWater;
    }
	
	public static void main(String[] args) {
		
		int [] height = {2,0,1,2,0,0,1,3};
		System.out.println(TrapRainWater.trap(height));

	}

}
