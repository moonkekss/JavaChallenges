//724. Find Pivot Index

/* Problem Statement
 * https://leetcode.com/problems/find-pivot-index/
 * Given an array of integers nums, write a method that returns the "pivot" index of this array.
 * The pivot index is the index where the sum of all the numbers to the left of the index is equal 
 * to the sum of all the numbers to the right of the index. If no such index exists, return -1. If 
 * there are multiple pivot indexes, you should return the left-most pivot index.
 */

/* Problem Approach
 * Calculate the total sum of the array first. Then, iterate through the array, maintaining a running 
 * sum of elements to the left. By subtracting the current element from the total sum, you can determine 
 * the sum of elements to the right of the current index. If the left sum equals the right sum at any index,
 * that index is the pivot index.
 */

/* Complexity Analysis
 * Time Complexity: O(n), where n is the length of the array. The array is traversed twice: once to compute 
 * the total sum and once to find the pivot index.
 * Space Complexity: O(1), as only a few variables are used.
 */

/* Example Test Cases
 * 
 * Test Case 1:
 * Input: nums = [1, 7, 3, 6, 5, 6]
 * Expected Output: 3
 * Explanation: At index 3, the sum of the numbers to the left of index 3 (1+7+3=11) is equal to 
 * the sum of numbers to the right of index 3 (5+6=11).
 * 
 * Test Case 2:
 * Input: nums = [1, 2, 3]
 * Expected Output: -1
 * Explanation: There is no index that satisfies the conditions in the problem statement.
 */

class Solution {
    public int pivotIndex(int[] nums) {
        int pivot = -1; // Default value if no pivot index is found
        int rightSum = 0; // Sum of elements to the right of the current index
        int leftSum = 0; // Sum of elements to the left of the current index

        // Compute the sum of all array elements
        for (int num : nums) {
            rightSum += num;
        }

        // Iterate through the array to find the pivot index
        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i]; // Exclude the current element from the right sum

            // Check if the left sum equals the right sum
            if (leftSum == rightSum) {
                pivot = i; // Set the pivot index
                break; // Exit the loop as we found the pivot index
            }

            leftSum += nums[i]; // Include the current element in the left sum
        }

        return pivot; // Return the pivot index or -1 if not found
    }
}
