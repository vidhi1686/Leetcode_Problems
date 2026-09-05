class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum=0;
        int count=0;
        map.put(0,1);
        for(int num:nums){
            sum=sum+num;
            int remainder = sum%k;
            if(remainder<0){
                remainder=k+remainder;
            }
            if(map.containsKey(remainder)){
                count+=map.get(remainder);
            }
            map.put(remainder ,map.getOrDefault(remainder ,0)+1);
        }
        return count;
        
    }
}