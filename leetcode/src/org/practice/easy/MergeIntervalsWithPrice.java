package org.practice.easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * https://leetcode.com/discuss/interview-question/233248/calculate-the-cheapest-price-for-the-item-during-the-day-within-different-time-intervals.
 * 
 */
public class MergeIntervalsWithPrice {
	
	static class IntervalWithPrice {
	    int start;
	    int end;
	    int price;

	    public IntervalWithPrice(int start, int end, int price) {
	        this.start = start;
	        this.end = end;
	        this.price = price;
	    }
	}
	
	public static List<IntervalWithPrice> mergeIntervals(List<IntervalWithPrice> intervals) {
        intervals.sort(Comparator.comparingInt(i -> i.start)); // sort asc by start time
        List<IntervalWithPrice> result = new ArrayList<>();
        IntervalWithPrice prev = null;
        for (IntervalWithPrice curr : intervals) {
            if (prev == null || !overlap(prev, curr)) {
                result.add(curr);
                prev = curr;
            } else {
                if (prev.price > curr.price) {
                    prev.end = curr.start;
                    result.add(curr);
                    prev = curr;
                } else {
                    if (curr.end > prev.end) {
                        curr.start = prev.end;
                        result.add(curr);
                        prev = curr;
                    }
                }
            }
        }

        return result;
    }

    private static boolean overlap(IntervalWithPrice i1, IntervalWithPrice i2) {
        return i2.start <= i1.end;
    }

	public static void main(String[] args) {
		
		IntervalWithPrice obj1 = new IntervalWithPrice(0, 4, 5);
		IntervalWithPrice obj2 = new IntervalWithPrice(2, 8, 3);
		IntervalWithPrice obj3 = new IntervalWithPrice(7, 11, 10);
		
		List<IntervalWithPrice> list = new ArrayList<>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		
		List<IntervalWithPrice> answer = MergeIntervalsWithPrice.mergeIntervals(list);
		
		for (IntervalWithPrice intervalWithPrice : answer) { 
			System.out.print(intervalWithPrice.start + " ");
			System.out.print(intervalWithPrice.end + " ");
			System.out.print(intervalWithPrice.price);
			System.out.println();
		}
		
	}
}
