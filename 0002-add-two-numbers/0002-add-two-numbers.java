/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 * 
 *     ListNode() {}
 * 
 *     ListNode(int val) {
 *         this.val = val;
 *     }
 * 
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Dummy node helps build the result list easily
        ListNode dummy = new ListNode(0);

        // Pointer used to traverse and add new nodes
        ListNode curr = dummy;

        // Stores carry during addition
        int carry = 0;

        // Continue while there are digits left or carry exists
        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            // Add value from first list if present
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            // Add value from second list if present
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Calculate carry
            carry = sum / 10;

            // Create new node with digit value
            curr.next = new ListNode(sum % 10);

            // Move pointer forward
            curr = curr.next;
        }

        // Return head of the result list
        return dummy.next;
    }
}