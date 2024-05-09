//876. Middle of the Linked List

/* Problem Statement
 * https://leetcode.com/problems/middle-of-the-linked-list/
 * Given the head of a singly linked list, return the middle node of the linked list.
 * If there are two middle nodes, return the second middle node.
 */

/* Problem Approach
 * The "tortoise and hare" approach is used here, where two pointers are utilized: 
 * one moving fast (two steps at a time) and one slow (one step at a time). 
 * By the time the fast pointer reaches the end of the list, the slow pointer will be at the middle.
 */

/*Complexity Analysis
 * This approach ensures that the space complexity remains O(1) as no additional data structures are used, 
 * and the time complexity is O(n) where n is the number of nodes in the list.
 */

/* Example Test Cases 
 * 
 * Test Case 1:
 * Input: [1,2,3,4,5]
 * Expected Output: [3,4,5]
 * Explanation: The middle node from the list [1,2,3,4,5] is 3. The output is the sublist starting from node 3.
 * 
 * Test Case 2:
 * Input: [1,2,3,4,5,6]
 * Expected Output: [4,5,6]
 * Explanation: When the list has an even number of elements, the second middle node is returned, starting from 4 in this case.
 */

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        // Slow moves one step, fast moves two steps
        while (fast != null && fast.next != null) {
            slow = slow.next; // slow moves one step
            fast = fast.next.next; // fast moves two steps
        }
        // When fast reaches the end, slow is at the middle
        return slow;
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
