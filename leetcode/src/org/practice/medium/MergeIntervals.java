package org.practice.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {
	
	public int[][] merge(int [][] intervals) {
		 if(intervals.length < 2)
		        return intervals;
		    
		    Arrays.sort(intervals, new Comparator<int[]>() {
		     @Override
		     public int compare(int[] a1, int[] a2) {
		         return a1[0] - a2[0];
		     }
		    });
		    
		    ArrayList<int[]> result = new ArrayList<>();
		    result.add(intervals[0]);
		    
		    for(int i = 1; i < intervals.length; i++) {
		        int[] top = result.get(result.size() - 1);
		        if(intervals[i][0] <= top[1]) {
		            top[1] = Math.max(top[1], intervals[i][1]);
		        } else {
		            result.add(intervals[i]);
		        }
		    }
		    
		    return result.toArray(new int[result.size()][]); // What does this [2] mean ?
		}

	public static void main(String[] args) {

		MergeIntervals obj = new MergeIntervals();
		
		int[][] intervals = { { 0, 30 }, { 5, 10 }, { 15, 20 }};
		
		int[][] merge = obj.merge(intervals);

		for (int i = 0; i < merge.length; i++) { 
			for (int j = 0; j< merge[0].length; j++)
				System.out.print(merge[i][j] + " ");
			System.out.println();
		}
		
	}

}
