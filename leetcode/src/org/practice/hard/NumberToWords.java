package org.practice.hard;

public class NumberToWords {

	String[] less_20 = {"", " One ", " Two ", " Three ", " Four ", " Five ", 
			" Six ", " Seven ", " Eight ", " Nine ", " Ten ", 
			" Eleven ", " Twelve ", " Thirteen ", " Fourteen ", " Fifteen ", 
			" Sixteen ", " Seventeen ", " Eighteen ", " Nineteen "};

	String[] tens = {"", " Twenty ", " Thirty ", " Forty ", " Fifty ", 
	" Sixty ", " Seventy ", " Eighty ", " Ninety "};

	public String numberToWords(int num) {
		
		if (num == 0)
			return "Zero";

		String finalWords =  helper (num);
		return finalWords;
    }
	
	String helper (int n) {
		String result;
		if (n < 20)
			result =  less_20[n];
		else if (n < 100)
			result =  tens[n/10 -1] + less_20[n % 10];
		else if (n < 1000)
			result =  helper(n/100) + " Hundred " + helper(n%100);
		else if (n < 1000000)
			result = helper(n/1000) + " Thousand " + helper(n%1000);
		else if (n < 1000000000)
			result = helper(n/1000000) + " Million " + helper(n%1000000);
		else
			result = helper(n/1000000000) + " Billion " + helper(n%1000000000);
		
		return result.trim();
	}
	
	public static void main(String[] args) {

		NumberToWords obj = new NumberToWords();
		System.out.println(obj.numberToWords(1000000));
		
	}

}
