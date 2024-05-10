//1768. Merge Strings Alternately

/* Problem Statement
 * https://leetcode.com/problems/merge-strings-alternately/
 * You are given two strings word1 and word2. Merge them by alternately taking characters from each,
 * appending the remainder of the longer string once one runs out of characters.
 */

/* Problem Approach
 * Use StringBuilder for efficient string manipulation. Iterate over the lengths of the two strings,
 * appending characters alternately. After the loop, append the remaining part of the longer string.
 */

/* Complexity Analysis
 * Time Complexity: O(n + m), where n is the length of word1 and m is the length of word2,
 * as each character of both strings is processed once.
 * Space Complexity: O(n + m), needed for the StringBuilder to store the merged result.
 */

/* Example Test Cases 
 * 
 * Test Case 1:
 * Input: word1 = "abc", word2 = "pqr"
 * Expected Output: "apbqcr"
 * Explanation: Characters are taken alternately from "abc" and "pqr".
 * 
 * Test Case 2:
 * Input: word1 = "ab", word2 = "pqrs"
 * Expected Output: "apbqrs"
 * Explanation: After merging "ab" and "pq", the remaining "rs" from "pqrs" is appended.
 */

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedWords = new StringBuilder(); // Use StringBuilder for efficient character appending.

        // Determine the minimum length to control the loop for merging letters
        // alternately.
        int minLength = Math.min(word1.length(), word2.length());

        // Merge characters alternately from both strings.
        for (int i = 0; i < minLength; i++) {
            mergedWords.append(word1.charAt(i)); // Append character from word1.
            mergedWords.append(word2.charAt(i)); // Append character from word2.
        }

        // Append the remainder of the longer string.
        if (word1.length() > word2.length()) {
            mergedWords.append(word1.substring(minLength)); // Append remaining characters from word1.
        } else if (word2.length() > word1.length()) {
            mergedWords.append(word2.substring(minLength)); // Append remaining characters from word2.
        }

        return mergedWords.toString(); // Convert StringBuilder to String and return.
    }
}
