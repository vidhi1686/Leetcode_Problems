class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        solve(s.toCharArray(), 0, ans);
        return ans;
    }

    void solve(char[] s, int i, List<String> ans) {
        if (i == s.length) {
            ans.add(new String(s));
            return;
        }

        if (Character.isLetter(s[i])) {
            s[i] = Character.toLowerCase(s[i]);
            solve(s, i + 1, ans);

            s[i] = Character.toUpperCase(s[i]);
            solve(s, i + 1, ans);
        } else {
            solve(s, i + 1, ans);
        }
    }
}