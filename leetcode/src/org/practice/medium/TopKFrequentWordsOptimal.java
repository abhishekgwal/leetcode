package org.practice.medium;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentWordsOptimal {

    class Node {
        String word;
        int freq;
        Node(String w, int f) {
            word = w;
            freq = f;
        }
    }
    
    public List<String> topKFrequent(String[] words, int k) {
    
    	PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<Node>(){
            @Override
            public int compare(Node a, Node b) {
                return a.freq == b.freq ? b.word.compareTo(a.word) : a.freq - b.freq;
            }
        });
        Map<String, Integer> map = new HashMap<>();
        for(String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }
        for(String w : map.keySet()) {
            pq.offer(new Node(w, map.get(w)));
            if(pq.size() > k) pq.poll();
        }
        List<String> res = new LinkedList<>();
        while(!pq.isEmpty()) {
            res.add(0, pq.poll().word);
        }
        return res;
    }
	
	public static void main(String[] args) {

		TopKFrequentWordsOptimal obj = new TopKFrequentWordsOptimal();
		String words[] = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
		List<String> result = obj.topKFrequent(words, 4);
		System.out.println(result);
		
	}

}
