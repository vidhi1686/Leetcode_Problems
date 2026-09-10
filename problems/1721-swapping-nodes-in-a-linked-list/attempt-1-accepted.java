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
    public ListNode swapNodes(ListNode head, int k) {
        int length = 0;
        ListNode temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        ListNode first = head;

        for (int i = 1; i < k; i++) {
            first = first.next;
        }
        int position = length - k + 1;

        ListNode second = head;

        for (int i = 1; i < position; i++) {
            second = second.next;
        }

        int tempValue = first.val;
        first.val = second.val;
        second.val = tempValue;

        return head;
    }
}