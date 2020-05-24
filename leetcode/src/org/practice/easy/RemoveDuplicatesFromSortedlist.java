package org.practice.easy;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
 *
 */

public class RemoveDuplicatesFromSortedlist {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return null;

		ListNode dummy = new ListNode(head.val == 0 ? 1 : 0);

		dummy.next = head;
		ListNode pre = dummy;
		ListNode cur = head;
		ListNode result = dummy;

		while (cur != null && cur.next != null) {

			if (cur.val != pre.val && cur.val != cur.next.val) {
				result.next = cur;
				result = result.next;
			}
			cur = cur.next;
			pre = pre.next;
		}

		if (cur.val != pre.val) {
			result.next = cur;
			result = result.next;
		}
		result.next = null;

		return dummy.next;
	}

	public static void main(String[] args) {

		RemoveDuplicatesFromSortedlist obj = new RemoveDuplicatesFromSortedlist();

		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(3);
		ListNode fifth = new ListNode(4);
		ListNode sixth = new ListNode(4);
		ListNode seventh = new ListNode(5);
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;

		ListNode list = obj.deleteDuplicates(first);
		
		while(list != null) {
			System.out.print(list.val + " ");
			list = list.next;
		}
	}
}
