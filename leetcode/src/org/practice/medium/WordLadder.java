package org.practice.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * https://leetcode.com/problems/word-ladder/ 
 *
 */

public class WordLadder {

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		Set<String> wordSet = new HashSet<>(wordList);
		if (!wordSet.contains(endWord))
			return 0;

		int res = 0;
		Queue<String> queue = new LinkedList<>();
		queue.offer(beginWord);

		while (!queue.isEmpty()) {

			for (int i = queue.size(); i > 0; --i) {
				String str = queue.poll();
				if (str.equals(endWord))
					return res + 1;

				for (int j = 0; j < str.length(); ++j) {
					char[] newWord = str.toCharArray();
					for (char ch = 'a'; ch < 'z'; ++ch) {
						newWord[j] = ch;
						String s = new String(newWord);
						if (wordSet.contains(s) && !s.equals(str)) {
							queue.offer(s);
							wordSet.remove(s);
						}
					}
				}
			}
			++res;
		}
		return 0;
	}

	public static void main(String[] args) {

	WordLadder obj = new WordLadder();
	String beginWord = "hit";
	String endWord = "cog";
	String[] wordList = {"hot","dot","dog","lot","log","cog"};
	List<String> list = Arrays.asList(wordList);
	
	System.out.println(obj.ladderLength(beginWord, endWord, list));
		
	}
}
//TC
//O(l times n)
// l - average length of word. 
// n - number of words