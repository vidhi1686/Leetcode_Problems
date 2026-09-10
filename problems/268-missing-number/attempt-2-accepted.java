class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=0; i<nums.length ;i++){
        //     if(nums[i]!=i){
        //         return i;
        //     }
        // }
        // return nums.length;

        boolean [] array = new boolean [nums.length+1];
        for(int num :nums){
            array[num]=true;
        }
        for(int i=0; i<array.length ;i++){
            if(array[i]== false){
                return i ;
            }
        }
        return -1;
        
    }
}