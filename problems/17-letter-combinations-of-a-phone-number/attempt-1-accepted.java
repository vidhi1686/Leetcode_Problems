class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        String[] map = {"", "", "abc", "def", "ghi", "jkl",
                        "mno", "pqrs", "tuv", "wxyz"};

        solve(digits, 0, "", map, ans);
        return ans;
    }

    void solve(String digits, int i, String curr,
               String[] map, List<String> ans) {
        if (i == digits.length()) {
            ans.add(curr);
            return;
        }

        String letters = map[digits.charAt(i) - '0'];

        for (char ch : letters.toCharArray()) {
            solve(digits, i + 1, curr + ch, map, ans);
        }
    }
}