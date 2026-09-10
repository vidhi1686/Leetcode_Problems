class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();
         List<Integer> result = new ArrayList<>();
        for(int num:nums){
            int freq= map.getOrDefault(num,0);
            if(freq==1){
                result.add(num);
        }
            map.put(num, freq+1);
        }
        return result;
        
    }
}