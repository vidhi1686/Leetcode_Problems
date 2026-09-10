class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList <Integer> result = new ArrayList<>();
        int carry =0;
        for(int i=num.length-1; i>=0 ;i--){
            int digit = k%10;
            int sum = digit + num[i] + carry ;
            int ansDig = sum%10;
            carry= sum /10;
            result.add(0,ansDig);
            k = k/10;
        }
        while(k>0){
            int digit = k%10;
            int sum = digit + carry;
            int ansDig = sum%10;
            carry=sum/10;
            result.add(0,ansDig);
            k=k/10;
        }
         if (carry > 0) {
            result.add(0, carry);
        }
        return result ;
    }
}