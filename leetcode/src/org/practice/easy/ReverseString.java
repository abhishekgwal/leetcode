package org.practice.easy;

/**
 * https://leetcode.com/problems/reverse-string/
 */
public class ReverseString {
	
    public void reverseString(char[] s) {
        
        int j = s.length - 1;
        int i = 0;
        
        if(j == 0) {
           System.out.print(""); 
           return;
        }
        
        while (i < j) {
            
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }
        
        for (char c : s){
            System.out.print("\""+c+ "\"" + ",");
        }
    }

	public static void main(String[] args) {

		char chr_arr[] = {'H','e','l','l','o'};
		
		ReverseString obj = new ReverseString();
		obj.reverseString(chr_arr);
		
	}

}
//"c"," "," ","a",",","n" - O
//"c"," ","a"," ",",","n" - E
//'n',',',' ','a',' ','c' - I