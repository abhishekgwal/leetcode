package org.practice.easy;

public class ParenthesisMatch {

	public int bracketMatch(String s) {
		
		if (s == null)
			return 0;
		
		int count = 0, ans = 0;
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) == '(')
				count++;
			
			else if(s.charAt(i) == ')')
				count--;
			
			if (count < 0) {
				count++;
				ans++;
			}
		}
		return ans + count;
	}
	
	public static void main(String[] args) {

		ParenthesisMatch obj = new ParenthesisMatch();
		System.out.println(obj.bracketMatch("(()"));
	
	}

}
