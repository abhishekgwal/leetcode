package org.practice.medium;

import java.util.Stack;

public class ReversePolishNotation {

	public int evalRPN(String[] tokens) {
    
		Stack<Integer> stack = new Stack<>();
		for (String token : tokens) {
			
			if ("+-*/".contains(token)) {
				int y = stack.pop();
				int x = stack.pop();
				
				if(token.equals("+"))
					stack.push(x + y);
				
				else if (token.equals("-"))
					stack.push(x -  y);
				
				else if (token.equals("*"))
					stack.push(x *  y);
				
				else if (token.equals("/"))
					stack.push(x / y);
			}
			else {
				stack.push(Integer.parseInt(token));
			}
		}
		return stack.pop();
    }
	
	public static void main(String[] args) {

		ReversePolishNotation obj = new ReversePolishNotation();
		String[] s = {"2", "1", "+", "3", "*"};
		System.out.println(obj.evalRPN(s));
		
	}
}
