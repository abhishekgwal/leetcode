package org.practice.easy;

// This is not a really good approach as you can see for sorting we take O(n2) which is bad.
// Then again we take O(n) in concatenate method.
// https://leetcode.com/problems/merge-two-sorted-lists/

public class MergeSortedList {
	
	static ListNode head1, head2;
	public static class ListNode {
		int data;
		ListNode next;
		
		ListNode(int data) {
			this.data = data;
		}
	}
	
	void printList(ListNode node) {
		
		while(node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		if (l1 == null) return l2;
		if (l2 == null) return l1;
        
		ListNode concat = concateNodes(l1, l2);
		
		int temp;        
        
        ListNode i, j;
        
        for (i = concat; i.next != null; i = i.next) {
            for (j = i.next; j != null; j = j.next) {
                
            if (i.data >= j.data) {
                temp = i.data;
                i.data = j.data;
                j.data = temp;
            }    
                
            }
        }
        
        return concat;
    }

	
	//Method to combine two linked list
	private ListNode concateNodes(ListNode l1, ListNode l2) {
		
        if (l1 != null && l2 != null) {
        	
            while(l1.next != null) 
                    l1 = l1.next;
                 l1.next = l2;
        }
		return head1;
	}

	public static void main(String[] args) {
		
		MergeSortedList obj = new MergeSortedList();
		
		head1 = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(4);
		
		head1.next = second;
		second.next = third;
		
		head2 = new ListNode(4);
		ListNode l2 = new ListNode(5);
		ListNode l3 = new ListNode(6);
		
		head2.next = l2;
		l2.next = l3;
		
		ListNode node = obj.mergeTwoLists(head1, head2);
		obj.printList(node);
		
		
	}

}
