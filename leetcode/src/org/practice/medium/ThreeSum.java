package org.practice.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/3sum/
 */

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        
		Arrays.sort(nums);
        
        Set<List<Integer>> set = new HashSet<>();
        
        for (int i = 0; i < nums.length - 2; i++) {
            
            int j =  i + 1;
            int k = nums.length - 1;
            
            while (j < k) {
                
                int sum = nums[i] + nums[j] + nums[k];
                
                if (sum == 0)
                    set.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                
// As the array is already sorted. j being the left pointer (pointing to lower
// numbers ) and k being the right pointer (pointing to higher numbers), with a
// static index i. If nums[i] + nums[j] + nums[k] is greater than target then we
// know we need to select the next highest number hence k--. Same way when the
// sum is lower we need to select a number just higher than the lowest.
                
                else if (sum < 0) j++;
                else if (sum > 0) k--;
            }
        }
        
        return new ArrayList<>(set);
    }
	
	public static void main(String[] args) {

		ThreeSum obj = new ThreeSum();
		int[] nums = {-1, 0, 1, 2, -1, -4};
		
		List<List<Integer>> result = obj.threeSum(nums);
		
		for (List<Integer> list: result)
			System.out.println(list);
		
	}

}
