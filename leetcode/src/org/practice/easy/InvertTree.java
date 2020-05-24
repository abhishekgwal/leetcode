package org.practice.easy;


//https://leetcode.com/problems/invert-binary-tree/
public class InvertTree {
	
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			val = x;
		}
	}
	
	static void inOrder(TreeNode root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.println(root.val);
		inOrder(root.right);
	}

	public TreeNode invertTree(TreeNode root) {
		
        if (root != null) {
            invertTree(root.left);
            invertTree(root.right);
        
        //Swap nodes at each level
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        }
        return root;
	}
	
	public static void main(String[] args) {
		
		InvertTree obj = new InvertTree();
		
		TreeNode node = new TreeNode(4);
		node.left = new TreeNode(2);
		node.right = new TreeNode(7);
		node.left.left = new TreeNode(1);
		node.left.right = new TreeNode(3);
		node.right.right = new TreeNode(9);
		node.right.left = new TreeNode(6);
		
		TreeNode res = obj.invertTree(node);
		inOrder(res);
	}
}
