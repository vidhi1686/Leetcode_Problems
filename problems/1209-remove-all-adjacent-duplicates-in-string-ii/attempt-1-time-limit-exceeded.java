import java.util.*;

class Solution {
    public String removeDuplicates(String s, int k) {

        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            ans = ans + s.charAt(i);

            int count = 0;

            for (int j = ans.length() - 1; j >= 0; j--) {

                if (ans.charAt(j) == s.charAt(i)) {
                    count++;
                } else {
                    break;
                }
            }

            if (count == k) {
                ans = ans.substring(0, ans.length() - k);
            }
        }

        return ans;
    }
}