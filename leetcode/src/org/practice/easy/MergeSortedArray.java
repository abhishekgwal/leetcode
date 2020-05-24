package org.practice.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedArray {
	
	public void mergeAnotherWay(int[] nums1, int[] nums2) {
		
		int max = Integer.MIN_VALUE, index = 0;
		for (int i = 0; i < nums1.length; i++) {
			if (nums1[i] > max) {
				max = nums1[i];
				index = i;
			}
		}
		
		for (int i = 0; i < nums2.length; i++) {
			nums1[++index] = nums2[i];
		}
		Arrays.sort(nums1);
		
		for (int i : nums1)
			System.out.println(i);
	}
	
    public void mergeMyWay(int[] nums1, int m, int[] nums2, int n) {
        
        for (int i = 0; i < n; i++) 
            nums1[m++] = nums2[i];
        Arrays.sort(nums1);
    }

/*    public void mergeLeetCodeWay(int[] nums1, int m, int[] nums2, int n) {
     
    	System.arraycopy(nums2, 0, nums1, m, n);
    	Arrays.sort(nums1);
    	
    	for (Integer i : nums1)
    		System.out.println(i);
    	
    }*/
	
	public static void main(String[] args) {

		MergeSortedArray obj = new MergeSortedArray();
		int[] nums1 = {1,2,3,-1,-5,-2};
		int m = 3;
		int[] nums2 = {2,5,6};       
		int n = 3;
		
		obj.mergeAnotherWay(nums1, nums2);
	}

}
