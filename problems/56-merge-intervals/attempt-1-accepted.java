import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> result = new ArrayList<>();

        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {

            int[] next = intervals[i];

            // Overlap
            if (next[0] <= current[1]) {
                current[1] = Math.max(current[1], next[1]);
            } 
            // No overlap
            else {
                result.add(current);
                current = next;
            }
        }

        // Add the last interval
        result.add(current);

        return result.toArray(new int[result.size()][]);
    }
}