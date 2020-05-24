package org.practice.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 * Not complete yet
 */
public class BinaryTreeLevelOrderTraversal {
	
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

    void preOrder(TreeNode root, List<List<Integer>> list) {
    	
   	 List<Integer> l1 = new ArrayList<>();

    	if (root == null)
    		return;
    	
    	 l1.add(root.val);
         list.add(l1);              
         preOrder(root.left, list) ;
         preOrder(root.right, list) ;
      }
	
	public static void main(String[] args) {

		BinaryTreeLevelOrderTraversal obj = new BinaryTreeLevelOrderTraversal();
		
		TreeNode root = null;
		
		root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		
		obj.preOrder(root, new ArrayList<>());
		
	}

}
