package org.practice.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/binary-tree-right-side-view/

public class RightSideView {
	
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
    public List<Integer> rightSideView(TreeNode root) {
        
        if (root == null) return new ArrayList<>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> list = new ArrayList<>();
        
        while(!queue.isEmpty()) {
            
            TreeNode last = ((LinkedList<TreeNode>) queue).getLast();
            list.add(last.val);
            
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                
                TreeNode node = queue.remove();
                if (node.left != null)
                    queue.add(node.left);
                
                if (node.right != null)
                    queue.add(node.right);
                
            }
        }
        return list;
        
    }
	
	public static void main(String[] args) {

		TreeNode root = null;
		RightSideView obj = new RightSideView();
		
		root = new TreeNode(3);
		root.left = new TreeNode(2);
		root.right = new TreeNode(6);
		root.right.left = new TreeNode(9);
		root.right.right = new TreeNode(8);
		root.right.right.right = new TreeNode(5);
		
		System.out.println(obj.rightSideView(root));
		
	}
}



