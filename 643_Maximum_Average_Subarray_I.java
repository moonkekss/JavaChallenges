//643. Maximum Average Subarray I

/* Problem Statement
 * https://leetcode.com/problems/maximum-average-subarray-i/
 * Given an array consisting of n integers, find the contiguous subarray of given length k 
 * that has the maximum average value. You need to output the maximum average value.
 */

/* Problem Approach
 * Implement a sliding window technique to find the maximum sum of any contiguous subarray of length k.
 * Start by calculating the sum of the first k elements. Then slide the window across the array by 
 * subtracting the element that is left behind and adding the new element to the sum. Update the maximum 
 * sum found as needed. This approach reduces the time complexity compared to calculating the sum of 
 * each subarray individually.
 */

/* Complexity Analysis
 * Time Complexity: O(n), where n is the number of elements in the array, as each element is processed 
 * exactly once after the initial subarray.
 * Space Complexity: O(1), as no additional space is used apart from a few variables.
 */

/* Example Test Cases
 * 
 * Test Case 1:
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Expected Output: 12.75
 * Explanation: Maximum average is achieved by subarray [12, -5, -6, 50] which is (12-5-6+50)/4 = 12.75.
 * 
 * Test Case 2:
 * Input: nums = [5,5,5,5,5,5,5,5,5], k = 1
 * Expected Output: 5.0
 * Explanation: With k = 1, the maximum average is 5, which is the value of every element.
 */

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0; // Holds the sum of elements within the current window

        // Calculate the sum of the first 'k' elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxSum = sum; // Initialize maxSum with the sum of the first 'k' elements

        // Slide the window across the array, starting from the (k+1)th element
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k]; // Update the sum to include the next element and exclude the last element of
                                          // the previous window
            maxSum = Math.max(maxSum, sum); // Update maxSum if the current window's sum is greater
        }

        return maxSum / k; // Calculate and return the maximum average
    }
}
