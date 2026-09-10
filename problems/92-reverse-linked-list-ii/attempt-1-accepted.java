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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }

        // Move to left position
        ListNode before = null;
        ListNode current = head;

        for (int i = 1; i < left; i++) {
            before = current;
            current = current.next;
        }

        // This will become the last node of reversed part
        ListNode tail = current;

        // Reverse from left to right
        ListNode prev = null;

        for (int i = left; i <= right; i++) {

            ListNode next = current.next;

            current.next = prev;
            prev = current;
            current = next;
        }

        // Connect left part to reversed part
        if (before != null) {
            before.next = prev;
        } else {
            head = prev;
        }

        // Connect reversed part to remaining list
        tail.next = current;

        return head;
    }
}