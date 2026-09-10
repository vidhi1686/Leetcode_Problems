class Solution {
    public String longestCommonPrefix(String[] words) {
        if (words == null || words.length == 0) return "";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words[0].length(); i++) {
            char ch = words[0].charAt(i);

            for (int j = 1; j < words.length; j++) {
                if (i >= words[j].length() || words[j].charAt(i) != ch) {
                    return result.toString();
                }
            }

            result.append(ch);
        }

        return result.toString();
    }
}