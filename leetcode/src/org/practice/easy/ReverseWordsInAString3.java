package org.practice.easy;

/**
 *  
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
 */
public class ReverseWordsInAString3 {
	
    public String reverseWords(String s) {
        
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            
            if (ch[i] != ' ') {
            	int j = i;
                while (j + 1 < ch.length && ch[j+1] != ' ')
                    j++;
                
                reverse(ch, i, j);
                i = j;
            }
        }
        
        return new String(ch);
    }
    
    void reverse(char ch[], int i, int j) {
        
        while(i < j) {
            char temp = ch[j];
            ch[j] = ch[i];
            ch[i] = temp;
            i++;
            j--;
        }
    }

	public static void main(String[] args) {

		ReverseWordsInAString3 obj = new ReverseWordsInAString3();
		String s = "Let's take LeetCode contest";
		obj.reverseWords(s);
		
	}

}
