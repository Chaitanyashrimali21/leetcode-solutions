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
         if(head == null )
         return false;

         ListNode fastptr = head;
         ListNode slowptr = head;

         while(fastptr.next != null && fastptr.next.next != null){
             fastptr= fastptr.next.next;
             slowptr = slowptr.next;

             if(fastptr==slowptr){
                 return true;
             }
         }

         return false;
    }
}