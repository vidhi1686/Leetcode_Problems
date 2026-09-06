import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        // Frequency of p
        int[] pFreq = new int[26];

        // Frequency of current window
        int[] sFreq = new int[26];

        // Count characters of p
        for (int i = 0; i < p.length(); i++) {
            pFreq[p.charAt(i) - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character to window
            sFreq[s.charAt(right) - 'a']++;

            // If window becomes bigger than p
            if (right - left + 1 > p.length()) {
                sFreq[s.charAt(left) - 'a']--;
                left++;
            }

            // If window size equals p length
            if (right - left + 1 == p.length()) {

                // Check if both frequency arrays are same
                if (Arrays.equals(pFreq, sFreq)) {
                    result.add(left);
                }
            }
        }

        return result;
    }
}