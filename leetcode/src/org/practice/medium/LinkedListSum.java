package org.practice.medium;

//https://leetcode.com/problems/add-two-numbers/

public class LinkedListSum {
	
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { 
		val = x; 		
	}
	
	public static ListNode sumLists(ListNode l1, ListNode l2) {
		
		ListNode temp = null;
		ListNode prev = null;
		ListNode res = null;
		int carry = 0;
		
		while (l1 != null || l2 != null) {
		
		int l1_val = 0;
		int l2_val = 0;
			
		if(l1 != null) { 
			l1_val = l1.val;
			l1 = l1.next;
		} 
		
		if(l2 != null) {
			l2_val = l2.val;
			l2 = l2.next;
		} 
			
			int sum = l1_val + l2_val + carry;
			if (sum > 9) {
				carry = sum / 10; 
			} else
				carry = 0;
			
			temp = new ListNode(sum%10);
			
			if(res == null)
				res = temp;
			else
				prev.next = temp;
			
			prev = temp;
			
		}
	
		if (carry > 0) 
			temp.next = new ListNode(carry);
		
		return res;
	}
	
	static ListNode createNodes(ListNode head, int n) {
		
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
	
	static void traverse(ListNode node) {
		
		while(node != null) {
			System.out.print(node.val + "->");
			node = node.next;
		}
	}
		
	public static void main(String[] args) {
	
		ListNode head1 = null;
		head1 = createNodes(head1, 7);
		head1 = createNodes(head1, 1);
		head1 = createNodes(head1, 6);
		
		ListNode head2 = null;
		head2 = createNodes(head2, 5);
		head2 = createNodes(head2, 9);
		head2 = createNodes(head2, 3);
		
		ListNode res = sumLists(head1, head2);
		
		traverse(res);

		}
	}
}
