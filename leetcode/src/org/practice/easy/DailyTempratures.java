package org.practice.easy;

import java.util.Stack;

public class DailyTempratures {
	
    public static int[] dailyTemperatures(int[] temperatures) {
    	
    	int[] result = new int[temperatures.length];
    	Stack<Integer> stack = new Stack<>(); // Make it a stack of indices.
    	for (int i = 0; i < temperatures.length; i++) {
    	    while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
    	        int index = stack.pop();
    	        result[index] = i - index;
    	    }
    	    stack.push(i);
    	}
    	return result;
    	
    }

	public static void main(String[] args) {
		
		int[] temp = {73,74,75,71,69,72,76,73};
		//int[] temp = {80,80,80,34,80,80,34,80,80,80};
		int res[] = DailyTempratures.dailyTemperatures(temp);
		
		for (int t : res)
		System.out.print(t + " ");

	}

}
