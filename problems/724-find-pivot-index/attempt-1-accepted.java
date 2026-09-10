class Solution {
    public int pivotIndex(int[] nums) {
        for (int pivot =0 ; pivot<nums.length ; pivot ++){
            int left = pivot-1;
            int right =pivot+1;
            int leftsum= 0;
            int rightsum=0;

            while(left>=0){
                leftsum=leftsum +nums[left];
                left--;

            }
            while(right<nums.length){
                rightsum= rightsum+ nums[right];
                right ++;

            }
            if(leftsum==rightsum){
                return pivot;
            }
        }
        return -1;

        }

    }
