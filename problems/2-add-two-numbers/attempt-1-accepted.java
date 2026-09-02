class Solution {
    public ListNode addTwoNumbers(ListNode a, ListNode b) {
        
        ListNode head = new ListNode(0);
        ListNode temp = head;

        ListNode temp1 = a;
        ListNode temp2 = b;

        int carry = 0;

        while (temp1 != null || temp2 != null || carry != 0) {

            int sum = carry;

            if (temp1 != null) {
                sum += temp1.val;
                temp1 = temp1.next;
            }

            if (temp2 != null) {
                sum += temp2.val;
                temp2 = temp2.next;
            }

            temp.next = new ListNode(sum % 10);
            temp = temp.next;

            carry = sum / 10;
        }

        return head.next;
    }
}