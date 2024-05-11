//2390. Removing Stars From a String

/* Problem Statement
 * https://leetcode.com/problems/removing-stars-from-a-string/
 * You are given a string s, which contains stars '*'. In one operation, you can:
 * - Choose a star in s.
 * - Remove the star and the character immediately to the left of the star (if it exists).
 * Return the string after all stars have been removed.
 */

/* Problem Approach
 * Use a stack to manage the characters of the string. Traverse the string from left to right:
 * - Push non-star characters onto the stack.
 * - Pop the top character from the stack when a star is encountered.
 * Finally, construct the resulting string by popping all characters from the stack.
 */

/* Complexity Analysis
 * Time Complexity: O(n), where n is the length of the string, because each character is processed once.
 * Space Complexity: O(n), as a stack is used to store characters of the string.
 */

/* Example Test Cases
 * 
 * Test Case 1:
 * Input: s = "ab*c"
 * Expected Output: "ac"
 * Explanation: The character 'b' is removed due to the star '*'.
 * 
 * Test Case 2:
 * Input: s = "a*bc*d"
 * Expected Output: "c"
 * Explanation: The characters 'a' and 'b' are removed due to the stars '*'.
 */

import java.util.Stack;

class Solution {
    public String removeStars(String s) {
        StringBuilder result = new StringBuilder(); // Use StringBuilder for efficient string manipulation
        Stack<String> stack = new Stack<>(); // Create a stack to store characters

        // Iterate over each character in the string
        for (int i = 0; i < s.length(); i++) {
            String currentChar = s.substring(i, i + 1); // Extract the current character

            if (!currentChar.equals("*")) {
                stack.push(currentChar); // Push the character onto the stack if it's not a star
            } else if (!stack.isEmpty()) {
                stack.pop(); // Pop the top character from the stack if a star is encountered
            }
        }

        // Reconstruct the result string from the stack
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop()); // Prepend characters to the result to maintain order
        }

        return result.toString(); // Convert StringBuilder to String and return
    }
}
