//1732. Find the Highest Altitude

/* Problem Statement
 * https://leetcode.com/problems/find-the-highest-altitude/
 * There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. 
 * The biker starts his trip on point 0 with altitude equal 0.
 * You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​
 * and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
 */

/* Problem Approach
 * Traverse the gain array, updating the current altitude by adding the current gain, then update the maximum altitude 
 * seen so far if the current altitude exceeds it. This approach effectively calculates the altitude at each point during
 * the road trip and keeps track of the highest point reached.
 */

/* Complexity Analysis
 * Time Complexity: O(n), where n is the length of the gain array, as we need to traverse the entire gain array once.
 * Space Complexity: O(1), as we use only a few variables for keeping track of the altitudes.
 */

/* Example Test Cases
 * 
 * Test Case 1:
 * Input: gain = [-5,1,5,0,-7]
 * Expected Output: 1
 * Explanation: The highest altitude reached is 1 (starting at 0 and going down to -5 then up to 1).
 * 
 * Test Case 2:
 * Input: gain = [-4,-3,-2,-1,4,3,2]
 * Expected Output: 0
 * Explanation: The highest altitude reached is 0 (as all the gains are negative or zero).
 */

class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0; // Initialize the maximum altitude as zero (starting point)
        int currentAltitude = 0; // Start at altitude zero

        // Iterate through each altitude gain
        for (int currentGain : gain) {
            currentAltitude += currentGain; // Update the current altitude by adding the gain
            maxAltitude = Math.max(maxAltitude, currentAltitude); // Update the maximum altitude if the current one is
                                                                  // higher
        }
        // Return the highest altitude reached during the trip
        return maxAltitude;
    }
}
