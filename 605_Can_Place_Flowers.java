//605. Can Place Flowers

/* Problem Statement
 * https://leetcode.com/problems/can-place-flowers/
 * Suppose you have a long flowerbed in which some of the plots are planted, and some are not. However, flowers
 * cannot be planted in adjacent plots. Given a flowerbed (represented as an array containing 0 and 1, where 0
 * means empty and 1 means not empty), and a number n, return if n new flowers can be planted in the flowerbed 
 * without violating the no-adjacent-flowers rule.
 */

/* Problem Approach
 * Iterate through the flowerbed array to find empty plots (0's) that have empty adjacent plots.
 * Use conditional checks to ensure no adjacent flowers before planting a new one.
 * Special edge cases are handled for the beginning and the end of the flowerbed.
 */

/* Complexity Analysis
 * Time Complexity: O(n), where n is the length of the flowerbed array, since each element is checked once.
 * Space Complexity: O(1), using constant space for the operations.
 */

/* Example Test Cases
 * 
 * Test Case 1:
 * Input: flowerbed = [1, 0, 0, 0, 1], n = 1
 * Expected Output: true
 * Explanation: The flower can be planted in the third plot.
 * 
 * Test Case 2:
 * Input: flowerbed = [1, 0, 0, 0, 1], n = 2
 * Expected Output: false
 * Explanation: Planting two flowers would violate the no-adjacent-flowers rule.
 */

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int emptyPot = 0; // Counter for the number of flowers that can be planted.

        // Check the beginning of the array separately when the array length is more
        // than 1
        if (flowerbed.length > 1) {
            if (flowerbed[0] == 0 && flowerbed[1] == 0) {
                flowerbed[0] = 1;
                emptyPot += 1;
            }
            if (flowerbed[flowerbed.length - 2] == 0 && flowerbed[flowerbed.length - 1] == 0) {
                flowerbed[flowerbed.length - 1] = 1;
                emptyPot += 1;
            }
        } else if (flowerbed[0] == 0) { // Special case for a single-element array
            flowerbed[0] = 1;
            emptyPot += 1;
        }

        // Main loop to check each plot in the array except the first and last
        for (int i = 1; i < flowerbed.length - 1; i++) {
            if (flowerbed[i] == 0 && flowerbed[i + 1] == 0 && flowerbed[i - 1] == 0) {
                flowerbed[i] = 1; // Plant the flower
                emptyPot += 1; // Increase the counter
            }
        }

        // Final check to see if the number of plants placed is at least as many as
        // needed
        return emptyPot >= n;
    }
}