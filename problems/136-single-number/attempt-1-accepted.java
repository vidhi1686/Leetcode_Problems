class Solution 
{
    public int singleNumber(int[] nums) {
        // for (int i = 0; i < nums.length; i++) {
        //     int count = 0;

        //     for (int j = 0; j < nums.length; j++) {
        //         if (nums[i] == nums[j]&&i!=j ) {
        //             count++;
        //         }
        //     }

        //     if (count == 0) {
        //         return nums[i];
        //     }
        // }
        // return -1; 

        int result = 0;
        for (int num :nums){
            result = result^num;    // use XOR: it removes the duplicate
        }
        return result;
    }
}