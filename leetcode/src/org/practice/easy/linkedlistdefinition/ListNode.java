package org.practice.easy.linkedlistdefinition;

public class ListNode {
	
		public int val;
		public ListNode next;
		public ListNode(int x) { 
		val = x; 		
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
	
	public static void traverse(ListNode node) {
		
		while(node != null) {
			System.out.print(node.val + "->");
			node = node.next;
		}
	}
}
