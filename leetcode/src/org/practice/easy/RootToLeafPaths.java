package org.practice.easy;

import java.util.ArrayList;
import java.util.List;

public class RootToLeafPaths {

	  public static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	  }
	
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> list = new ArrayList<>();
        if (root == null)
            return list;
        
        traverse(root, "", list);
        return list;
    }
    
    void traverse(TreeNode root, String path, List<String> list) {
        
        if (root.left == null && root.right == null) 
            list.add(path + root.val);
        
        if (root.left != null) {
            traverse(root.left, path + root.val + "->", list);
        }
        
        if (root.right != null) {
            traverse(root.right, path + root.val + "->", list);
        }
        
    }
    
	public static void main(String[] args) {

		RootToLeafPaths obj = new RootToLeafPaths();
		
		TreeNode root = new TreeNode(4);
		root.right = new TreeNode(5);
		root.right.right = new TreeNode(6);
		
		root.left = new TreeNode(8);
		root.left.left = new TreeNode(10);
		root.left.right = new TreeNode(9);
		
		obj.binaryTreePaths(root);
		
	}
}
