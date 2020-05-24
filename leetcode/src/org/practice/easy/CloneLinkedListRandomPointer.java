package org.practice.easy;

public class CloneLinkedListRandomPointer {
	
	public static class Node {
		int val;
		Node next;
		Node random;
		Node(){}
		
		Node(int val, Node next, Node random) {
			this.val = val;
			this.next = next;
			this.random = random;
		}
	}
	
	Node deepCopy(Node head) {
		
		Node copy = head;
		return copy;
	}

	public static void main(String[] args) {

		CloneLinkedListRandomPointer obj = new CloneLinkedListRandomPointer();
		
		Node first = new Node();
		Node second = new Node();
		Node third = new Node();
		
		first.next = second;
		second.next = third;
		
		Node node = obj.deepCopy(first);
		
		while(node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
		
	}

}
