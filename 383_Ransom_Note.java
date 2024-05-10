//383. Ransom Note

/* Problem Statement
 * https://leetcode.com/problems/ransom-note/
 * You are given two strings, ransomNote and magazine. Return true if ransomNote can be constructed from the letters in magazine and false otherwise.
 * Each letter in the magazine can only be used once in the ransom note.
 */

/* Problem Approach
 * Iterate through each character of the ransom note. For each character, check if it exists in the magazine string.
 * If it does, remove that character from the magazine string to ensure it's not reused. If any character cannot be found, return false.
 */

/* Complexity Analysis
 * Space Complexity: O(1) - no additional significant space used beyond input strings.
 * Time Complexity: O(m * n) where m is the length of the ransomNote and n is the average length of the magazine string, due to the indexOf operation.
 */

/* Example Test Cases 
 * 
 * Test Case 1:
 * Input: ransomNote = "a", magazine = "b"
 * Expected Output: false
 * Explanation: 'a' is not present in 'b'.
 * 
 * Test Case 2:
 * Input: ransomNote = "aa", magazine = "ab"
 * Expected Output: false
 * Explanation: There are not enough 'a's in 'ab' to construct the ransom note.
 * 
 * Test Case 3:
 * Input: ransomNote = "aa", magazine = "aab"
 * Expected Output: true
 * Explanation: The ransom note 'aa' can be constructed from 'aab' as there are sufficient 'a's.
 */

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i < ransomNote.length(); i++) {
            char letter = ransomNote.charAt(i); // Extract each character of the ransomNote
            int matchingIndex = magazine.indexOf(letter); // Find the first occurrence of the letter in magazine

            if (matchingIndex == -1) { // If the letter is not found
                return false; // It's not possible to construct the ransomNote
            }

            // Remove the found letter from the magazine to prevent its reuse
            magazine = magazine.substring(0, matchingIndex) + magazine.substring(matchingIndex + 1);
        }
        return true; // Return true if all letters are found and used appropriately
    }
}