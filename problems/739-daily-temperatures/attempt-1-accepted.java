class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int[] nums=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nums[i]=0;
            }
            else{
                nums[i]=st.peek()-i;
            }
            st.push(i);
           
        }
        return nums;

    }
}