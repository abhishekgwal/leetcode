package org.practice.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/high-five/
 * 
 * Given a list of scores of different students, return the average score of
 * each student's top five scores in the order of each student's id.
 * 
 * Each entry items[i] has items[i][0] the student's id, and items[i][1] the
 * student's score. The average score is calculated using integer division.
 * 
 * Input:
 * [[1,91],[1,92],[2,93],[2,97],[1,60],[2,77],[1,65],[1,87],[1,100],[2,100],[2,76]]
 * Output: [[1,87],[2,88]] Explanation: The average of the student with id = 1
 * is 87. The average of the student with id = 2 is 88.6. But with integer
 * division their average converts to 88.
 */
public class HighFive {

	public int[][] highFive(int[][] items) {
		
		//Create a hashmap which holds the key as student id and List of scores as value
		Map<Integer, List<Integer>> map = new HashMap<>();
		List<List<Integer>> finalScoresList = new ArrayList<>();
		List<Integer> averageList = new ArrayList<>();
		int sum = 0, average = 0;
		
		// Scan through the array and add it to the map
		for (int i = 0; i < items.length; i++) {

			if (!map.containsKey(items[i][0]))
				map.put(items[i][0], new ArrayList<>());

			map.get(items[i][0]).add(items[i][1]);
		}
		
		// create the result array which holds the size the of the map
		int[][] result = new int[map.keySet().size()][2];
		finalScoresList.addAll(map.values());
		
		//Now traverse through the scores list and also sort them in reverse order
		//because we want the top 5 scores 
		for (List<Integer> scoreList :  finalScoresList) {
			Collections.sort(scoreList, Collections.reverseOrder());
		
		for (int i = 0; i < scoreList.size(); i++) {
				if (i == 5) break; // Breaking the loop at 5 because we only want top 5 scores
				sum += scoreList.get(i);
				average = sum/5;
			}
		averageList.add(average); // This list contains the final average all scores
		
		sum = 0;
		}
		
		int j = 0;
		// Now loop through the keyset (student id) and assign the id and values inside result array 
		for (int i : map.keySet()) {
			
			result[j][0] = i;
			result[j][1] = averageList.get(j); 
			j++;		
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		HighFive obj = new HighFive();
		int items[][] = {{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}};
		int result[][] = obj.highFive(items);
		
		for (int[] i : result) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}
}
