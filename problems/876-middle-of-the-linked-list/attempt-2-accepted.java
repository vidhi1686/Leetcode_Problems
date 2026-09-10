class Solution {
    public ListNode middleNode(ListNode head) {
        // ListNode temp = head;
        // int count =0;
        // while(temp!=null){
        //     count++;
        //     temp = temp.next;
        // }
        // for(int i=1;i<=count/2;i++){
        //     head = head.next;
        // }
        // return head;

        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}