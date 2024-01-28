/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode newTail = head;
        ListNode temp = head;

        int len = 1;
        if (head == null)
            return head;
        while (newTail.next != null) {
            newTail = newTail.next;
            len++;
        }
        k = len - k % len;

        for (int i = 1; i < k; i++) {
            temp = temp.next;
        }

        newTail.next = head;
        head = temp.next;
        temp.next = null;
        return head;

    }
}