class Solution {
    public String minWindow(String s, String t) {

        int[] freq = new int[128];

        // Count characters required from t
        for (char ch : t.toCharArray()) {
            freq[ch]++;
        }

        int left = 0;
        int right = 0;

        int count = t.length();

        int minLength = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {

            char ch = s.charAt(right);

            // If this character is needed
            if (freq[ch] > 0) {
                count--;
            }

            freq[ch]++;
            right++;

            // Window is valid
            while (count == 0) {

                // Update minimum window
                if (right - left < minLength) {
                    minLength = right - left;
                    start = left;
                }

                char leftChar = s.charAt(left);
                freq[leftChar]--;

                // Removing this character makes window invalid
                if (freq[leftChar] > 0) {
                    count++;
                }

                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLength);
    }
}