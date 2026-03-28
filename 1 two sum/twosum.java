/**
 * Problem: Two Sum
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/two-sum/
 * Date: March 29, 2026
 * Status: ✅ Solved (Accepted)
 * 
 * APPROACH:
 * Use HashMap to store numbers we've seen and their indices.
 * For each number, check if complement (target - current) exists.
 * If yes, return indices. If no, add current to map.
 * 
 * ALGORITHM:
 * 1. Create HashMap<number, index>
 * 2. Loop through array
 * 3. Calculate complement = target - nums[i]
 * 4. If complement in map → return [map.get(complement), i]
 * 5. Else → add nums[i] to map with index i
 * 
 * Time Complexity: O(n) - single pass
 * Space Complexity: O(n) - HashMap storage
 * 
 * KEY LEARNING:
 * HashMap is perfect for "find pair/complement" problems.
 * Trade space (O(n)) for time improvement (O(n²) → O(n)).
 */

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) {
                return new int[] { map.get(comp), i };
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}