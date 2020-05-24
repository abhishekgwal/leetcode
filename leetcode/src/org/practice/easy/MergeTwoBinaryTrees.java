package org.practice.easy;

/**
 * https://leetcode.com/problems/merge-two-binary-trees
 */
public class MergeTwoBinaryTrees {
	
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			val = x;
		}
	}
	
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        
        if(t1 == null)
            return t2;
        
        if(t2 == null)
          return t1;
        
        t1.val = t1.val + t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        
        return t1;
        
    }

	public static void main(String[] args) {
		
		MergeTwoBinaryTrees obj = new MergeTwoBinaryTrees();
		
		TreeNode node1 = new TreeNode(1);
		node1.left = new TreeNode(3);
		node1.right = new TreeNode(2);
		node1.left.left = new TreeNode(5);
	
		TreeNode node2 = new TreeNode(2);
		node2.left = new TreeNode(1);
		node2.right = new TreeNode(3);
		node2.right.right = new TreeNode(7);
		node2.left.right = new TreeNode(4);
		
		obj.mergeTrees(node1, node2);
	}

}
