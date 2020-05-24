package org.practice.easy;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string-ii/
 */

public class ReverseStringArrayInPlace {

	public void reverseInPlace(char[] s) {
		int len = s.length - 1;

		for (int i = 0; i < s.length / 2; i++) {
			char temp = s[i];
			s[i] = s[len];
			s[len--] = temp;
		}

		for (int i = 0; i < s.length; i++) {
			if (s[i] != ' ') { // when i is a non-space
				int j = i;
				while (j + 1 < s.length && s[j + 1] != ' ') {
					j++;
				} // move j to the end of the word
				reverse(s, i, j);
				i = j;
			}
		}
	}

	private void reverse(char[] arr, int i, int j) {
			while(i < j) {
			char tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			i++;
			j--;
		}
	}

	public static void main(String[] args) {

		ReverseStringArrayInPlace obj = new ReverseStringArrayInPlace();
		char[] arr = {'c', 'o', 'd', 'i', 'n' ,'g', ' ', 'i' , 's' ,' ', 'g', 'o', 'o','d'};
		obj.reverseInPlace(arr);

		for (char c : arr)
			System.out.print(c);

	}
}
