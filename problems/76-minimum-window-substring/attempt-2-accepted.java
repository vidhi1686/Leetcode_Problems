
class Solution {
    public String minWindow(String s, String t) {

        int[] freq = new int[128];

        // Store required characters
        for (char ch : t.toCharArray()) {
            freq[ch]++;
        }

        int left = 0;
        int count = t.length();

        int start = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // Character is still needed
            if (freq[ch] > 0) {
                count--;
            }

            freq[ch]--;

            // We have a valid window
            while (count == 0) {

                // Save the smallest window
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                freq[leftChar]++;

                // This character is now missing
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

