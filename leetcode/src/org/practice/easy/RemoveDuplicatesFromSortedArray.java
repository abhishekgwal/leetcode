package org.practice.easy;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        
        int count = 1;
        if (nums.length == 0 || nums == null) return 0;
        
        int j = 1;
        for(int i = 0; i < nums.length - 1; i++) {
            
            if (nums[i] != nums[j++])
                count++;
            
        }
        return count;
    }
	
	public static void main(String[] args) {
	
		int[] a = {1,1,2};
		removeDuplicates(a);

	}

}
