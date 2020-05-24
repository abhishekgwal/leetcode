package org.practice.medium;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/word-break/
public class WordBreak {

	public static boolean wordBreak(String s, List<String> wordDict) {

		boolean[] dp = new boolean[s.length() + 1];
		dp[0] = true;

		for (int i = 1; i <= s.length(); i++) {
			for (int j = 0; j < i; j++) {

			if (dp[j] && wordDict.contains(s.substring(j, i))) {
				dp[i] = true;
				break;
			}
		}
	}
	return dp[s.length()];
}

	public static void main(String[] args) {

		String s = "65";

		char[] ch = s.toCharArray();
		int charLen = ch.length;
		int finalNum = 0, i = 0;

		while (charLen > 0) {

			int num = ch[i++] - '0';
			num = (int) (num * Math.pow(10, --charLen));
			finalNum += num;
		}
		System.out.println(finalNum);
	    String str = "leetcode";
	    String[] wordArr = {"leet", "code"};
	    List<String> wordList = Arrays.asList(wordArr);
	    System.out.print(WordBreak.wordBreak(str, wordList));
		
	}
}
