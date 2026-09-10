class Solution {
    public int[] plusOne(int[] digits) {
        // int n = digits.length;

        // for (int i = n - 1; i >= 0; i--) {

        //     if (digits[i] < 9) {
        //         digits[i] = digits[i] + 1;
        //         return digits;
        //     }

        //     digits[i] = 0;
        // }

        // int[] newDigits = new int[n + 1];
        // newDigits[0] = 1;
        // return newDigits;

        for(int i=digits.length-1 ; i>=0 ;i--){
            if(digits[i]<9){
                digits[i]=digits[i]+1;
                return digits;
            }
            else{
                digits[i]=0;
            }
        }
        int [] newArr  = new int [digits.length +1];
        newArr[0] =1;
        return newArr;


    }
}