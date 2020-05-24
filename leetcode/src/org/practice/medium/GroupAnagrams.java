package org.practice.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/group-anagrams/
 */
public class GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {

		List<List<String>> anagramList = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();

		for (String s : strs) {

			// sort each string
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			String sort = new String(ch);

			// If the key is not present then add it to the hashmap
			if (!map.containsKey(sort)) {
				List<String> list = new ArrayList<>();
				list.add(s);
				map.put(sort, list);
			}
			// If the key is present then add it to the existing list
			else {
				List<String> list = map.get(sort);
				list.add(s);
				map.put(sort, list);
			}

		}
		anagramList.addAll(map.values());
		return anagramList;
	}

	public static void main(String[] args) {

		GroupAnagrams obj = new GroupAnagrams();
		String strs[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> result = obj.groupAnagrams(strs);
		for (List<String> s : result)
			System.out.println(s);

	}
}
