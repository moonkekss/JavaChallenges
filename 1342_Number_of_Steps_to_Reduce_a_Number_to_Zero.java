//1342. Number of Steps to Reduce a Number to Zero

/* Problem Statement
 * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 * Given a non-negative integer num, return the number of steps to reduce it to zero. 
 * If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
 */

/* Problem Approach
 * The approach is to use a while loop to continuously modify the number until it reaches zero. 
 * Within the loop, check if the number is even or odd. If it's even, divide by 2; if it's odd, subtract 1.
 * Keep a count of the number of operations performed.
 */

/* Complexity Analysis
 * Time Complexity: O(log n), since dividing the number by 2 reduces its size significantly, leading to fewer steps as the number decreases.
 * Space Complexity: O(1), as the operation requires a constant amount of space regardless of the input size.
 */

/* Example Test Cases
 * 
 * Test Case 1:
 * Input: 14
 * Expected Output: 6
 * Explanation: The sequence of operations is 14->7->6->3->2->1->0. It takes 6 steps to reduce 14 to zero.
 * 
 * Test Case 2:
 * Input: 8
 * Expected Output: 4
 * Explanation: The sequence of operations is 8->4->2->1->0. It takes 4 steps to reduce 8 to zero.
 */

class Solution {
    public int numberOfSteps(int num) {
        int steps = 0; // Initialize steps count
        while (num != 0) { // Continue until the number is reduced to zero
            if (num % 2 == 0) { // Check if the number is even
                num /= 2; // Divide the number by 2
            } else { // If the number is odd
                num -= 1; // Subtract 1 from the number
            }
            steps += 1; // Increment the step count each iteration
        }
        return steps; // Return the total number of steps taken
    }
}