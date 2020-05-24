package org.practice.easy;

import java.util.HashSet;
import java.util.Set;

public class CokeMachine {
	
	public static boolean coke(int[][] buttons, int[] target) {
        return coke(buttons, new int[2], target, new HashSet<>());
    }

    private static boolean coke(int[][] buttons, int[] curr, int[] target, Set<String> memo) {
         if (curr[0] >= target[0] && curr[1] <= target[1]) return true;
        if (curr[1] > target[1]) return false;

        String key = curr[0] + "-" + curr[1];
        if (memo.contains(key)) return false;

        for (int[] button : buttons) {
            curr[0] += button[0];
            curr[1] += button[1];
            if (coke(buttons, curr, target, memo)) return true;
            curr[0] -= button[0];
            curr[1] -= button[1];
        }
        memo.add(key);
        return false;
    }
    
    public static void main(String[] args) {
        int[][] buttons = {{100, 120}, {200, 240}, {400, 410}};
        int[] target = {300, 360};
        System.out.println(coke(buttons, target));
    }

}
