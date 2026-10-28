class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        solve(s, 0, 0, "", ans);
        return ans;
    }

    void solve(String s, int index, int count,
               String curr, List<String> ans) {

        if (count == 4) {
            if (index == s.length()) {
                ans.add(curr.substring(0, curr.length() - 1));
            }
            return;
        }

        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {
            String part = s.substring(index, index + len);

            if (part.length() > 1 && part.charAt(0) == '0')
                break;

            if (Integer.parseInt(part) > 255)
                break;

            solve(s, index + len, count + 1, curr + part + ".", ans);
        }
    }
}