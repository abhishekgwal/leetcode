package org.practice.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
	
    public int romanToInt(String s) {
        
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        
        int length = s.length();
        int result = romanMap.get(s.charAt(length - 1));
        
        for (int i = length - 2; i >=0; i--) {
            
            if(romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i+1))) 
                result = result + romanMap.get(s.charAt(i));
            else
                result = result - romanMap.get(s.charAt(i));
        }
            return result;     
    }

	public static void main(String[] args) {

		RomanToInt obj = new RomanToInt();
		System.out.println(obj.romanToInt("XLIX"));
		
	}

}
