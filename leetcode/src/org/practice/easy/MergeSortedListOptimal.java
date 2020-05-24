package org.practice.easy;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/ 
 * https://www.youtube.com/watch?v=j_UNYW6Ap0k&t=122s
 */

public class MergeSortedListOptimal {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode s = null;
		ListNode result = null;

		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		if (l1.val <= l2.val) {
			s = l1;
			l1 = l1.next;
			result = s;
		} else {
			s = l2;
			l2 = l2.next;
			result = s;
		}
		while (l1 != null && l2 != null) {

			if (l1.val <= l2.val) {
				s.next = l1;
				l1 = l1.next;
				s = s.next;
			} else {
				s.next = l2;
				l2 = l2.next;
				s = s.next;
			}
		}
		if (l1 == null)
			s.next = l2;
		else 
			s.next = l1;
		return result;
	}

	public static void main(String[] args) {
		MergeSortedListOptimal obj = new MergeSortedListOptimal();

		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		first.next = second;
		second.next = third;

		ListNode first1 = new ListNode(4);
		ListNode second1 = new ListNode(5);
		ListNode third1 = new ListNode(6);
		first1.next = second1;
		second1.next = third1;

		ListNode result = obj.mergeTwoLists(first, first1);
		
		while(result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}
}
