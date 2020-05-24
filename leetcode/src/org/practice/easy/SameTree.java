package org.practice.easy;

/**
 * https://leetcode.com/problems/same-tree/
 */

public class SameTree {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
		
	    if(p == null && q == null) return true;
	    if(p == null || q == null) return false;
		
		if (p.val == q.val) { 
			boolean leftTree = isSameTree(p.left, q.left); 
			boolean rightTree = isSameTree(p.right, q.right);
			
			return leftTree && rightTree;
		}
		return false;
	}


	public static void main(String[] args) {
		
		TreeNode root = null;
		TreeNode root1 = null;
		
		SameTree obj = new SameTree();
		root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		
		root1 = new TreeNode(1);
		root1.left = new TreeNode(5);
		root1.right = new TreeNode(3);

		System.out.println(obj.isSameTree(root, root1));
	}

}
