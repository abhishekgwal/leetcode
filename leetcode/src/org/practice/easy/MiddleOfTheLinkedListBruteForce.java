package org.practice.easy;

public class MiddleOfTheLinkedListBruteForce {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	
	void traverse (ListNode node) {
		while (node != null) {
			System.out.print(node.val + "-> ");
			node = node.next;
		}
	}
	
    public ListNode middleNode(ListNode head) {
    	
    	ListNode temp = head, prev = null;
    	int count = 0, mid = 0, nodeCount = 0;
    	
    	while (head != null) {
    		count++;
    		head = head.next;
    	}
    	
    	mid = count/2;
    	
    	while (temp != null) {
    		
    		if (nodeCount == mid) {
    			prev.next = temp.next;
    		}
    		else {
    			prev = temp;
    			temp = temp.next;
    		}
    		nodeCount++;
    	}
    	return temp;
    }
	
	public static void main(String[] args) {

		MiddleOfTheLinkedListBruteForce obj = new MiddleOfTheLinkedListBruteForce();
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
		
		obj.middleNode(first);
		obj.traverse(first);
	}

}
