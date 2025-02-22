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
     
public ListNode oddEvenList(ListNode head) {
    if (head == null || head.next == null) return head;  // Handle edge cases
    
    ListNode oddPtr = head;
    ListNode evenHead = head.next;
    ListNode evenPtr = evenHead;

    while (evenPtr != null && evenPtr.next != null) {
        oddPtr.next = evenPtr.next;
        oddPtr = oddPtr.next;

        evenPtr.next = oddPtr.next;
        evenPtr = evenPtr.next;
    }
    
    oddPtr.next = evenHead;  // Link odd list to even list
    
    return head;  // Return the original head
}
}