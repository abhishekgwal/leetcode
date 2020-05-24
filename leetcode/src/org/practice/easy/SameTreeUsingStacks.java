package org.practice.easy;

import java.util.Stack;

/**
 * https://leetcode.com/problems/same-tree/ 
 *
 */

public class SameTreeUsingStacks {
	
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	//Applying preOrder traversal
	public boolean isSameTree(TreeNode p, TreeNode q) {
	     Stack<TreeNode> stack_p = new Stack <> ();       
	     Stack<TreeNode> stack_q = new Stack <> ();
	     
	     if (p != null) 
	    	 stack_p.push( p ) ;
	     
	     if (q != null) 
	    	 stack_q.push( q ) ;
	     
	     while (!stack_p.isEmpty() && !stack_q.isEmpty()) {
	    	 
	    	 TreeNode pn = stack_p.pop() ;
	    	 TreeNode qn = stack_q.pop() ;
	    	 
	    	 //root
	    	 if (pn.val != qn.val) 
	    		 return false ;
	    	 
	    	 //left subtree
	    	 if (pn.left != null) 
	    		 stack_p.push(pn.left) ;
	    	 
	    	 if (qn.left != null) 
	    		 stack_q.push(qn.left) ;
	    	 
	    	 if (stack_p.size() != stack_q.size()) 
	    		 return false ;
	    	 
	    	 //right subtree
	    	 if (pn.right != null) 
	    		 stack_p.push(pn.right) ;
	    	 
	    	 if (qn.right != null) 
	    		 stack_q.push(qn.right) ;
	    	 
	    	 if (stack_p.size() != stack_q.size()) 
	    		 return false ;
	     }		     
	     return stack_p.size() == stack_q.size() ;	 
	 }

	public static void main(String[] args) {
		
		SameTreeUsingStacks obj = new SameTreeUsingStacks();
		
		TreeNode root = null;
		TreeNode root1 = null;
		
		root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		
		root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(3);
		root1.right.right = new TreeNode(4);
		
		System.out.println(obj.isSameTree(root, root1));
		
	}

}
