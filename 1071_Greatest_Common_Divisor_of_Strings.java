//1071. Greatest Common Divisor of Strings

/* Problem Statement
 * https://leetcode.com/problems/greatest-common-divisor-of-strings/
 * Given two strings str1 and str2, return the greatest common divisor of str1 and str2.
 * The gcd of two strings is the largest string that divides both strings.
 */

/* Problem Approach
 * The solution checks if str1 and str2 can form each other when concatenated in different orders.
 * If they can, it then finds the largest divisor length that can divide both string lengths and
 * checks through all possible divisor lengths to find the maximum possible divisor.
 */

/* Complexity Analysis
 * Time Complexity: O(n + m), where n is the length of str1 and m is the length of str2,
 * due to the iteration through the minimum length of str1 and str2.
 * Space Complexity: O(1), as only a few extra variables are used.
 */

/* Example Test Cases 
 * 
 * Test Case 1:
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Expected Output: "ABC"
 * Explanation: "ABC" is the repeating unit that can form "ABCABC" and "ABC".
 * 
 * Test Case 2:
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Expected Output: "AB"
 * Explanation: "AB" is the repeating unit that can form both "ABABAB" and "ABAB".
 */

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Initialize the result divisor as an empty string
        String divisor = "";
        // Check if the two strings can form each other when concatenated in different
        // orders
        if ((str1 + str2).equals(str2 + str1)) {
            int minLength = Math.min(str1.length(), str2.length()); // Calculate the minimum length of the two strings
            int divisorLength = 0; // Variable to hold the maximum divisor length
            // Loop through all possible lengths up to the minimum length
            for (int i = 1; i <= minLength; i++) {
                // Check if both string lengths are divisible by the current length i
                if (str1.length() % i == 0 && str2.length() % i == 0) {
                    divisorLength = i; // Update the divisor length to i if both strings are divisible
                }
            }
            // Extract the substring from str1 from 0 to divisorLength as the divisor
            divisor = str1.substring(0, divisorLength);
        }
        // Return the divisor string or an empty string if no common divisor is found
        return divisor;
    }
}
