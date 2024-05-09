//1672. Richest Customer Wealth

/* Problem Statement
 * https://leetcode.com/problems/richest-customer-wealth/
 * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money 
 * the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
 * A customer's wealth is the amount of money they have in all their bank accounts. 
 * The richest customer is the customer that has the maximum wealth.
 */

/* Problem Approach
 * Iterate through each customer's accounts. For each customer, calculate the sum of their account balances 
 * and then update the maximum wealth found so far if the current customer's wealth exceeds it.
 */

/* Complexity Analysis
 * Space Complexity: O(1) since no extra space is used beyond the input array itself.
 * Time Complexity: O(m*n), where m is the number of customers and n is the number of banks, because 
 * every bank balance for every customer is processed once.
 */

/* Example Test Cases 
 * 
 * Test Case 1:
 * Input: [[1,2,3],[3,2,1]]
 * Expected Output: 6
 * Explanation: The richest customer has the wealth 1+2+3 = 6.
 * 
 * Test Case 2:
 * Input: [[1,5],[7,3],[3,5]]
 * Expected Output: 10
 * Explanation: The customer with the wealth 7+3 = 10 is the richest.
 */

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0; // Initialize maximum wealth to zero
        for (int[] account : accounts) {
            int sum = 0; // Sum to store the wealth of the current customer
            for (int bank : account) {
                sum += bank; // Add the current bank's balance to the customer's total wealth
            }
            max = Math.max(sum, max); // Update max if the current customer's wealth is higher
        }
        return max; // Return the maximum wealth found
    }
}
