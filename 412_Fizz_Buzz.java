//412. Fizz Buzz

/* Problem Statement
 * https://leetcode.com/problems/fizz-buzz/
 * Write a program that outputs the string representation of numbers from 1 to n.
 * But for multiples of three, it should output “Fizz” instead of the number, and for the multiples of five output “Buzz”. 
 * For numbers which are multiples of both three and five output “FizzBuzz”.
 */

/* Problem Approach
 * Loop through numbers from 1 to n. Check for divisibility by 3, 5, and both to determine the appropriate output.
 * Use boolean flags to manage conditions cleanly, avoiding repetitive checks and making the code easy to read and maintain.
 */

/* Complexity Analysis
 * Space Complexity: O(n) due to storing the output for each number up to n.
 * Time Complexity: O(n) as we iterate from 1 to n exactly once.
 */

/* Example Test Cases 
 * 
 * Test Case 1:
 * Input: 5
 * Expected Output: ["1", "2", "Fizz", "4", "Buzz"]
 * Explanation: Numbers 3 and 5 are replaced by "Fizz" and "Buzz", respectively.
 * 
 * Test Case 2:
 * Input: 15
 * Expected Output: ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"]
 * Explanation: 15 ends with "FizzBuzz" because it is divisible by both 3 and 5.
 */

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>(n); // Initializing the list with capacity n
        for (int i = 1; i < n + 1; i++) {
            boolean fizz = (i % 3 == 0);
            boolean buzz = (i % 5 == 0);
            if (fizz && buzz) {
                result.add("FizzBuzz");
            } else if (buzz) {
                result.add("Buzz");
            } else if (fizz) {
                result.add("Fizz");
            } else {
                result.add(String.valueOf(i)); // Convert integer to string and add to the list
            }
        }
        return result; // Return the list containing the results
    }
}
