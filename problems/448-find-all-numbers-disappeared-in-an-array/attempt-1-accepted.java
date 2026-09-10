class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean  []arr = new boolean[nums.length+1];
        ArrayList<Integer> result = new ArrayList<> ();
        for(int i:nums)
        {
            arr[i] = true;
        }
        for(int i =1; i<= nums.length; i++)
        {
            if(!arr[i])
            {
                result.add(i);
            }
        }
        
    return result;
    }
}