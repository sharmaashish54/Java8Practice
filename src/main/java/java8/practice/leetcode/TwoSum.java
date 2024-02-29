package java8.practice.leetcode;

import java.util.Arrays;

/*
 * 1. Two Sum
Easy
Topics
Companies
Hint
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] sortedNums = Arrays.copyOf(nums, nums.length); // Create a copy to preserve original order
        Arrays.sort(sortedNums); // Sort the copy

        int left = 0, right = nums.length - 1;
        while (left < right) {
            int currentSum = sortedNums[left] + sortedNums[right];
            if (currentSum == target) {
                // Find indices in the original array
                int index1 = findIndex(nums, sortedNums[left],-1);
                int index2 = findIndex(nums, sortedNums[right], index1); // Avoid returning the same index twice
                return new int[] { index1, index2 };
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return null; // No solution found
    }

    // Helper function to find the index of a value in the original array
    private int findIndex(int[] nums, int value, int excludeIndex) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value && i != excludeIndex) {
                return i;
            }
        }
        return -1; // Value not found
    }
}
