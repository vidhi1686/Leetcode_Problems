import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int num : nums1) {
            if (!list1.contains(num)) {
                list1.add(num);
            }
        }

        for (int num : nums2) {
            if (!list2.contains(num)) {
                list2.add(num);
            }
        }

        ArrayList<Integer> ans1 = new ArrayList<>();
        ArrayList<Integer> ans2 = new ArrayList<>();

        for (int num : list1) {
            if (!list2.contains(num)) {
                ans1.add(num);
            }
        }

        for (int num : list2) {
            if (!list1.contains(num)) {
                ans2.add(num);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(ans1);
        result.add(ans2);

        return result;
    }
}