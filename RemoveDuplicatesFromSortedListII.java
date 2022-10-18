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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newNode = new ListNode();
        newNode.next = head;
    
        if(head == null || head.next == null) return head;
        
        ListNode pre = newNode, cur = head;
        
        while(cur != null){
            if(cur.next != null && cur.val == cur.next.val){
                while(cur.next != null && cur.val == cur.next.val){
                   cur = cur.next; 
                }
                pre.next = cur.next;
            }
            else{
                pre = cur;
            }
            cur = cur.next;            
        }
        return newNode.next;
    }
}
