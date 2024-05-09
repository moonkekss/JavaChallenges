//1480. Running Sum of 1d Array

/* Problem Statement
 * https://leetcode.com/problems/running-sum-of-1d-array/
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 */

/* Problem Approach
 * Iterate through the array starting from the first index, updating each element to be the sum of itself 
 * and all previous elements. This modifies the array in place for an efficient solution.
 */

/* Complexity Analysis
 * This approach ensures the space complexity remains O(1), as no additional data structures are used 
 * beyond the input array itself.
 * The time complexity is O(n), where n is the number of elements in the input array, as each element 
 * is processed exactly once.
 */

/* Example Test Cases 
 * 
 * Test Case 1:
 * Input: [1,2,3,4]
 * Expected Output: [1,3,6,10]
 * Explanation: The running sums are [1, 1+2, 1+2+3, 1+2+3+4].
 * 
 * Test Case 2:
 * Input: [1,1,1,1,1]
 * Expected Output: [1,2,3,4,5]
 * Explanation: Each element is one, so the running sum simply increments by one each time.
 */

class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1]; // Add the previous element to the current element
        }
        return nums; // Return the modified array as the running sum
    }
}
