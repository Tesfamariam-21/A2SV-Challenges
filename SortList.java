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
    public ListNode sortList(ListNode head) {
        if (head == null) return null;

        List<Integer> list = new ArrayList<>();
        ListNode n = head;

        while (n != null) {
            list.add(n.val);
            n = n.next;
        }

        Collections.sort(list, Collections.reverseOrder());

        ListNode newNode = new ListNode(-1);
        ListNode newHead = newNode;

        while (!list.isEmpty()) {
            int idx = list.size() - 1;
            newNode.next = new ListNode(list.remove(idx));
            newNode = newNode.next;
        }

        return newHead.next;
    }
}
