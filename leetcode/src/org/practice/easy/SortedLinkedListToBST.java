package org.practice.easy;

/**
 * https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/
 */
public class SortedLinkedListToBST {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode sortedListToBST(ListNode head) {
		if (head == null)
			return null;
		return createBST(head, null);
	}

	TreeNode createBST(ListNode head, ListNode tail) {

		if (head == tail)
			return null;
		ListNode slow = head;
		ListNode fast = head;

		while (fast != tail && fast.next != tail) {
			slow = slow.next;
			fast = fast.next.next;
		}

		TreeNode root = new TreeNode(slow.val);
		root.left = createBST(head, slow);
		root.right = createBST(slow.next, tail);

		return root;
	}

	public static void main(String[] args) {
		
		SortedLinkedListToBST obj = new SortedLinkedListToBST();
		
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);
		ListNode n7 = new ListNode(7);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;

		obj.sortedListToBST(n1);
		
		while (n1 != null) {
			System.out.print(n1.val + " ->");
			n1 = n1.next;
		}
	}

}
