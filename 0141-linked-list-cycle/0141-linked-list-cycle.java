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
        // Hash Table Method

        Set<ListNode> visited_nodes = new HashSet<>();
        ListNode currNode = head;

        while (currNode != null) {
            if (visited_nodes.contains(currNode)) {
                return true;
            }
            visited_nodes.add(currNode);
            currNode = currNode.next;
        }
        return false;
    }
}

/* Intuition and Logic Behind the Solution
The basic idea here is to traverse the list and keep a record of the nodes we've visited so far. If at any point we encounter a node that we've already visited, we can conclude that there is a cycle in the list.

Initialization:

* Create an empty set, visited_nodes, to keep track of the nodes that have been visited.

Traversal and Verification:

* Traverse the list starting from the head node.
* At each node, check whether it already exists in visited_nodes.
* If it does, return True as a cycle is detected.
* Otherwise, add the node to visited_nodes. */