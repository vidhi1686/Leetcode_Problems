class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {

            int maxFrequency = 0;
            int maxNumber = 0;

            for (int num : map.keySet()) {

                if (map.get(num) > maxFrequency) {
                    maxFrequency = map.get(num);
                    maxNumber = num;
                }
            }

            result[i] = maxNumber;

            map.remove(maxNumber);
        }

        return result;
    }
}