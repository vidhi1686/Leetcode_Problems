class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> result = new ArrayList<>();

        HashMap<String, Integer> required = new HashMap<>();

        for (String word : words) {
            required.put(word, required.getOrDefault(word, 0) + 1);
        }

        int wordLength = words[0].length();
        int wordCount = words.length;

        // Try every possible starting offset
        for (int offset = 0; offset < wordLength; offset++) {

            int left = offset;
            int right = offset;
            int count = 0;

            HashMap<String, Integer> seen = new HashMap<>();

            while (right + wordLength <= s.length()) {

                String word = s.substring(right, right + wordLength);
                right += wordLength;

                // Word is not present in words
                if (!required.containsKey(word)) {
                    seen.clear();
                    count = 0;
                    left = right;
                    continue;
                }

                // Add current word
                seen.put(word, seen.getOrDefault(word, 0) + 1);
                count++;

                // Too many copies of this word
                while (seen.get(word) > required.get(word)) {

                    String leftWord = s.substring(left, left + wordLength);

                    seen.put(leftWord, seen.get(leftWord) - 1);

                    left += wordLength;
                    count--;
                }

                // All words are present
                if (count == wordCount) {
                    result.add(left);

                    // Move window forward
                    String leftWord = s.substring(left, left + wordLength);

                    seen.put(leftWord, seen.get(leftWord) - 1);

                    left += wordLength;
                    count--;
                }
            }
        }

        return result;
    }
}