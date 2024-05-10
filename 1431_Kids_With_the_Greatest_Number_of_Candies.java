//1431. Kids With the Greatest Number of Candies

/* Problem Statement
 * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 * Given the array candies and the integer extraCandies, where candies[i] represents the number of candies 
 * that the ith kid has. For each kid check if there is a way to distribute extraCandies among the kids such 
 * that he or she can have the greatest number of candies among them. Notice that multiple kids can have 
 * the greatest number of candies.
 */

/* Problem Approach
 * First, find the maximum number of candies any kid currently has.
 * Then, compare each kid's candy count plus the extraCandies to this maximum to determine if they can have 
 * the greatest number after distribution.
 */

/* Complexity Analysis
 * Time Complexity: O(n), where n is the number of kids, as we need to iterate over the candies array twice.
 * Space Complexity: O(n), for storing the results in the List.
 */

/* Example Test Cases 
 * 
 * Test Case 1:
 * Input: candies = [2,3,5,1,3], extraCandies = 3
 * Expected Output: [true,true,true,false,true]
 * Explanation: Here, the maximum candy any kid has is 5. Giving the first kid 3 extra candies results in 
 * 2+3=5 candies, which matches the maximum. Thus, the first kid gets true.
 * 
 * Test Case 2:
 * Input: candies = [4,2,1,1,2], extraCandies = 1
 * Expected Output: [true,false,false,false,false]
 * Explanation: Only the first kid can reach the maximum number of candies, which is 4+1=5.
 */

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>(candies.length); // Initialize the result list
        int max = 0; // Variable to store the maximum number of candies
        // First loop to determine the maximum number of candies any kid has
        for (int candy : candies) {
            max = Math.max(candy, max); // Update the max if current candy count is higher
        }
        // Second loop to determine if each kid can have the maximum number with
        // extraCandies
        for (int candy : candies) {
            // If current candy count plus extraCandies is greater than or equal to max,
            // then true
            if (candy + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false); // Otherwise, false
            }
        }
        return result; // Return the list of boolean results
    }
}
