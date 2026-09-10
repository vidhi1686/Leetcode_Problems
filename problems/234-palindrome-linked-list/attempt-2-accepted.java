class Solution {
    public boolean isPalindrome(ListNode head) {
        // List<Integer> list = new ArrayList();
        // while(head != null) {
        //     list.add(head.val);
        //     head = head.next;
        // }
        
        // int left = 0;
        // int right = list.size()-1;
        // while(left < right && list.get(left) == list.get(right)) {
        //     left++;
        //     right--;
        // }
        // return left >= right;

        int count =0;
        ListNode temp =head ;
        while(temp!=null){
            temp=temp.next;
            count++;
    
        }
        ListNode prev=null;
        ListNode current =head;

        for(int i = 0; i < count/2; i++) {
            current = current.next;

        }

        // ArrayList <Integer> revList = new ArrayList <>();


        for(int i =count/2 ; i<count ;i++){
            ListNode next =current.next;
            current.next=prev;
            prev=current;
            current = next;
            // revList.add(prev);
        }
        temp=head;
        while(prev!=null){
            if(temp.val!=prev.val){
                return false;
            }
            temp=temp.next;
            prev=prev.next;
            
        }
        return true;
    }
}