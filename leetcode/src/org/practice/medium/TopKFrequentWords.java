package org.practice.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/top-k-frequent-words/

public class TopKFrequentWords {

    List<String> listOfString = new ArrayList<>();
	List<String> finalresult = new ArrayList<>();
	Set<String> keys = new LinkedHashSet<>();
	 List<String> topKFrequentWords (String[] words, int k) {
		
		Map<String, Integer> map = new LinkedHashMap<>();
		List<Integer> valueList = new ArrayList<>();
		int count = 0;
		Arrays.sort(words);
		
		for (String word : words) {
			if(map.containsKey(word))
				map.put(word, map.get(word) + 1);
			else
				map.put(word, 1);
		}
		
		for (Map.Entry<String, Integer> mapItems : map.entrySet()) {
			Integer value = mapItems.getValue();
			valueList.add(value);
		}
		
		Collections.sort(valueList, Collections.reverseOrder());
		
		for (Integer i : valueList) {
			 keys  = getKeys(map, i);
		}
		
		for (String s : keys) {
			if (count == k)
				break;
			else {
			count++;
			finalresult.add(s);
			}
		}
		return finalresult;
    }

	public Set<String> getKeys(Map<String, Integer> map, Integer value) {
	    
	    for (Map.Entry<String, Integer> entry : map.entrySet()) {
	        if (entry.getValue().equals(value)) {
	            keys.add(entry.getKey());
	        }
	    }
	    return keys;
	}
		
	public static void main(String[] args) {
		
			TopKFrequentWords obj = new TopKFrequentWords();
			String[] str = {"i", "love", "leetcode", "i", "love", "coding"};
			ArrayList<String> res = (ArrayList<String>) obj.topKFrequentWords(str, 2);
			System.out.println(res);
		
	}
}
