/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // Floyd’s Cycle-Finding Algorithm (Tortoise Hare algo)
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}

// Use two pointers : slow (tortoise 🐢 ) and fast (hare 🐇 ). The slow pointer moves one step at a time, while the fast pointer moves two steps at a time. If there's a cycle, the fast pointer will eventually meet the slow pointer inside the cycle. If there's no cycle, the fast pointer will reach the end of the list.