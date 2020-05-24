package org.practice.medium;

import org.practice.easy.treedefinition.TreeNode;

/**
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/ 
 * https://www.youtube.com/watch?v=13m9ZCB8gjw&t=	
 */

public class LowestCommonAncestor {

	TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
		
		if (root == null)
			return null;
		
		if (root == p || root == q)
			return root;
		
		TreeNode leftSubTree = lca(root.left, p, q);
		TreeNode rightSubTree = lca(root.right, p, q);
		
		if (leftSubTree != null && rightSubTree != null)
			return root;
		
		if (leftSubTree == null && rightSubTree == null)
			return null;
		
		return leftSubTree != null ? leftSubTree : rightSubTree;
	}
	
	public static void main(String[] args) {

		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(6);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(11);
		root.left.right.right = new TreeNode(5);
		root.left.right.left = new TreeNode(9);
		
		root.right = new TreeNode(8);
		root.right.right = new TreeNode(13);
		root.right.right.left = new TreeNode(7);
		
		LowestCommonAncestor obj = new LowestCommonAncestor();
		TreeNode node = obj.lca(root, root.left.right.left, root.left.right.right);
										//9                5
		System.out.println(node.val);
	}
}
