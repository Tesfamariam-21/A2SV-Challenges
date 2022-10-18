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
    public ListNode middleNode(ListNode head) {
        ListNode normalPointer = head;
        ListNode fastPointer = head;
        
        while(fastPointer != null && fastPointer.next != null ){
            normalPointer = normalPointer.next;
            fastPointer = fastPointer.next.next;
        }
        
        return normalPointer;
    }
}
