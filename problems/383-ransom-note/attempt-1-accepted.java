class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] freq = new int[26];

        // Count characters in magazine
        for (int i = 0; i < magazine.length(); i++) {
            freq[magazine.charAt(i) - 'a']++;
        }

        // Use characters for ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {
            freq[ransomNote.charAt(i) - 'a']--;

            // Character is not available
            if (freq[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}