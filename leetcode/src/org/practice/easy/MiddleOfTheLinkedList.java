package org.practice.easy;

/**
 * https://leetcode.com/problems/middle-of-the-linked-list/
 */
public class MiddleOfTheLinkedList {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	
    public ListNode middleNode(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    
    void traverse(ListNode node) {
    	
    	while (node != null) {
    		System.out.print(node.val + "->");
    		node = node.next;
    		
    	}
    	
    }
	
	public static void main(String[] args) {

		MiddleOfTheLinkedList obj = new MiddleOfTheLinkedList();
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		ListNode sixth = new ListNode(6);
		
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		
		ListNode result = obj.middleNode(first);
		obj.traverse(result);
	}

}
