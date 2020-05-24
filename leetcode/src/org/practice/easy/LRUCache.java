package org.practice.easy;

import java.util.HashMap;
import java.util.Map;

class LRUCache {
	
    DoublyLinkedList list;
    Map<Integer, Node> map;
    Integer cap;
    
    public LRUCache(int capacity) {
        list = new DoublyLinkedList();
        map = new HashMap(capacity);
        cap = capacity;
    }
    
    public int get(int key) {
        Node node = map.get(key);
        if(node == null){
            return -1;
        }
        list.moveToHead(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        Node node = map.get(key);
        if(node != null){
            list.moveToHead(node);
            node.val = value;

        }else{
             Node newNode = new Node(key, value);
            if(map.size() == cap){
                Node tail = list.getTail();
                map.remove(tail.key);
                list.removeTail();
            }
            map.put(key, newNode);
            list.addToHead(newNode);
        }
    }
    
    public static void main(String[] args) {
		
    	LRUCache cache = new LRUCache(2);
    	cache.put(1, 1);
    	cache.put(2, 2);
    	System.out.println(cache.get(1));
    	
	}
}

class DoublyLinkedList{
    Node fakeHead;
    Node fakeTail;
    
    //create a pseudo head and tail to mark the boundary, 
    //so that we don't need to check the NULL node during the update. 
    
    DoublyLinkedList(){
        fakeHead = new Node(0,0);
        fakeTail = new Node(0,0);
        fakeHead.next = fakeTail;
        fakeTail.prev = fakeHead;
    }
    
    void moveToHead(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
        addToHead(node);
    }
    
    void addToHead(Node node){
        Node tmp = fakeHead.next ;
        fakeHead.next = node;
        node.next = tmp;
        node.prev = fakeHead;
        tmp.prev = node;
    }
    
    void removeTail(){
        Node newTail = fakeTail.prev.prev;
        newTail.next = fakeTail;
        fakeTail.prev = newTail;
    }
    
    Node getTail(){
        return fakeTail.prev;
    }
    
}

 class Node{
        int key;
        int val;
        Node next;
        Node prev;
        Node(int key, int value){
            this.key = key;
            this.val =value;
        }
}
