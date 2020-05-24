package org.practice.medium;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/permutations/discuss/18237/My-AC-simple-iterative-javapython-solution
public class PermutationsIterative {
	
	public List<List<Integer>> permute(int[] num) {
		
	       List<List<Integer>> res = new ArrayList<>();
	       List<Integer> l = new ArrayList<>();
	       l.add(num[0]);
	       res.add(l);
	        
	       for (int i = 1; i < num.length; i++) {
	        List<List<Integer>> new_list = new ArrayList<>();
	           
	           for (List<Integer> li : res) {
	            for (int j = 0; j <= i; j++) {
	             List<Integer> sub_list = new ArrayList<>(li);	
	             sub_list.add(j, num[i]);
	             new_list.add(sub_list);
	               
	           }                 
	            res = new_list;   
	           }
	       }
		return res;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		PermutationsIterative obj = new PermutationsIterative();
		List<List<Integer>> list = obj.permute(nums);
		for (List<Integer> l : list) {
			System.out.println(l);
		}
	}

}
