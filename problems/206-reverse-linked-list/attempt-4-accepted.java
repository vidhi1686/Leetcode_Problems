class Solution {
    public ListNode reverseList(ListNode head) {
        // ListNode node = null;

        // while (head != null) {
        //     ListNode temp = head.next;
        //     head.next = node;
        //     node = head;
        //     head = temp;
        // }

        // return node; 

        ListNode prev= null;
        ListNode current = head;
        while(current!=null){
            ListNode next = current.next;
            current.next=prev;
            prev=current;
            current=next;
        } 
        return prev;      
    }
}