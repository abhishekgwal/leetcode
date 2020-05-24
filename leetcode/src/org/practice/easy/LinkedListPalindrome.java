package org.practice.easy;

import org.practice.easy.linkedlistdefinition.ListNode;

public class LinkedListPalindrome {
	
	static boolean isPalindrome(ListNode head) {
		
		ListNode prev = null;
		ListNode temp = head;
		ListNode curr = head;
		
		int count = 0, countCopy = 0;
		while(head != null) {
			count++;
			head = head.next;
		}
		
		countCopy = count;
		count = count/2;
		
		if (count == 0)
			return true;
		
		while(count > 0) {
			temp = temp.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
			count--;
		}
		
		if (countCopy%2 == 1)
			curr = curr.next;
		
		while(prev != null || curr != null) {
			
			if (prev.val != curr.val)
				return false;
			else {
				prev = prev.next;
				curr = curr.next;
			}
		}
		return true;
		
	}
	
	public static ListNode createNodes(ListNode head, int n) {
		
		ListNode node = new ListNode(n);
		
		ListNode traverse = null;
		if (head == null)
			head = node;
		else {
			traverse = head;
			while(traverse.next != null ) {
				traverse = traverse.next;
			}
			traverse.next = node;
		}
		return head;
	}
	
	public static void main(String[] args) {

		ListNode head = null;
		head = createNodes(head, 1);
		head = createNodes(head, 2);
		head = createNodes(head, 3);
		head = createNodes(head, 2);
		head = createNodes(head, 1);
		
		boolean isPalindrome = isPalindrome(head);
		System.out.println(isPalindrome);
		
	}

}
