package org.practice.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle-ii/ 
 */

public class PascalTraingle2 {
	
    public List<Integer> getRow(int rowIndex) {
        
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == i)
                    list.add(1);
                else {
                	list.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                }
                
            }
            res.add(list);
        }
        return res.get(rowIndex);
    }

	public static void main(String[] args) {
		
		PascalTraingle2 obj = new PascalTraingle2();
		System.out.println(obj.getRow(3));
		
	}

}
