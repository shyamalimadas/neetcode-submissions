/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        //Step 1 make a new empty list  --> you can't do that because you are using the ListNode instead of a LinkedList for example
        ListNode prev = null;     // Tracks the previous node (becomes the new tail/head)
        ListNode current = head;  // Tracks the node currently being processed
        ListNode next = null;     // Temporarily stores the remainder of the list

        while (current != null) {
            next = current.next;  // 1. Save the next node
            current.next = prev;  // 2. Reverse the current node's pointer
            prev = current;       // 3. Move 'prev' one step forward
            current = next;       // 4. Move 'current' one step forward
        }

        // 'prev' is now pointing to the new head of the reversed list
        return prev;  
    }
}
