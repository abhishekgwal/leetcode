package org.practice.easy;

public class PerfectSquare {
	
	static boolean is_square(int x)
	{
	  int i;
	  for(i=0;i*i<=x;i++)
	    if(i*i==x) return true;
	  return false;
	}

	public static void main(String[] args) {
		
		System.out.println(PerfectSquare.is_square(24));
		
	}

}
