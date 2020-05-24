package org.practice.medium;

import java.util.HashMap;
import java.util.Map;

public class Sol {
	public static int findShortestSubArray(int[] nums) {
	int len=nums.length;
    if(len==0) return 0;
    Map<Integer,Integer> count= new HashMap<>();
    Map<Integer,Integer> starts= new HashMap<>();
    Map<Integer,Integer> ends= new HashMap<>();
    int max=0;
    for(int i=0;i<len;i++){
        if(!count.containsKey(nums[i])){
            count.put(nums[i],0);
            starts.put(nums[i],i);
        }
        ends.put(nums[i],i);
        count.put(nums[i],count.get(nums[i])+1);
        max=Math.max(count.get(nums[i]),max);
    }
    int min=Integer.MAX_VALUE;
    for(Integer key: count.keySet()){
        if(count.get(key)==max){
            min=Math.min(min,ends.get(key)-starts.get(key)+1);
        }
    }
    return min;
	}
	
	public static void main(String[] args) {
		int[] arr = {5,2,3,4,5,5};
		Sol.findShortestSubArray(arr);
		
	}
}
