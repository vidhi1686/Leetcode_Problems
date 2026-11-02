class Solution {
    public int findKthLargest(int[] nums, int k) {

        int target = nums.length - k;

        return quickSelect(nums, 0, nums.length - 1, target);
    }

    public int quickSelect(int[] nums, int left, int right, int target) {

        int pivot = nums[right];
        int i = left;

        for (int j = left; j < right; j++) {

            if (nums[j] <= pivot) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }

        int temp = nums[i];
        nums[i] = nums[right];
        nums[right] = temp;

        if (i == target) {
            return nums[i];
        }
        else if (i < target) {
            return quickSelect(nums, i + 1, right, target);
        }
        else {
            return quickSelect(nums, left, i - 1, target);
        }
    }
}