class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];

        int left = 1;

        // Store left products
        for (int i = 0; i < nums.length; i++) {
            answer[i] = left;
            left = left * nums[i];
        }

        int right = 1;

        // Multiply by right products
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] = answer[i] * right;
            right = right * nums[i];
        }

        return answer;
    }
}