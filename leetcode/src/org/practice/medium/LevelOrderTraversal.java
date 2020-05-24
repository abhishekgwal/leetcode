package org.practice.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 */

public class LevelOrderTraversal {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<List<Integer>> levelOrder(TreeNode root) {

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		List<List<Integer>> finalList = new ArrayList<>();

		while (!queue.isEmpty()) {

			List<Integer> list = new ArrayList<>();
			int size = queue.size();

			for (int i = 0; i < size; i++) {
				TreeNode temp = queue.poll();
				list.add(temp.val);
				if (temp.left != null)
					queue.add(temp.left);
				if (temp.right != null)
					queue.add(temp.right);
			}
			finalList.add(list);
		}
		return finalList;
	}

	public static void main(String[] args) {

		LevelOrderTraversal obj = new LevelOrderTraversal();

		TreeNode root = null;
		root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		
		List<List<Integer>> lists = obj.levelOrder(root);
		for (List<Integer> list: lists) 
			System.out.println(list);

	}

}
