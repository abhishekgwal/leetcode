package org.practice.easy;

import java.util.ArrayList;
import java.util.List;

import org.practice.easy.treedefinition.TreeNode;

/**
 * https://leetcode.com/problems/boundary-of-binary-tree/
 */
public class BoundaryTraversal {

	List<Integer> leftRightSubTree (TreeNode root) {
		
		List<Integer> leftRightList = new ArrayList<>();
		traverseLeft(root, leftRightList);
		leafNodes(root);
		traverseRight(root.right, leftRightList);
		
		return leftRightList;
		
	}
	
	void traverseRight(TreeNode root, List<Integer> rightList) {
		
		if (root == null) return;
		
		rightList.add(root.val);
		traverseRight(root.right, rightList);
		
	}

	void traverseLeft(TreeNode root, List<Integer> leftList) {
		
		if (root == null) return;
		
		leftList.add(root.val);
		traverseLeft(root.left, leftList);
		
	}
	
	List<Integer> leafNodes (TreeNode root) {
		
		List<Integer> list = new ArrayList<>();
		getLeafNodes(root, list);
		return list;
		
	}
	
	void getLeafNodes(TreeNode root, List<Integer> list) {
		
		if (root == null) return;
		
		if (root.left ==  null && root.right == null)
			list.add(root.val);
		
		getLeafNodes(root.left, list);
		getLeafNodes(root.right, list);
	}
	
	public static void main(String[] args) {
		
		BoundaryTraversal obj = new BoundaryTraversal();
		
		TreeNode root = new TreeNode(4);
		root.right = new TreeNode(5);
		root.right.right = new TreeNode(6);
		
		root.left = new TreeNode(8);
		root.left.left = new TreeNode(10);
		root.left.right = new TreeNode(9);
		
		System.out.println(obj.leftRightSubTree(root));
		
	}

}
