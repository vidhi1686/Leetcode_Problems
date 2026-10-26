class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int moves = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(c);
            } else {
                if (!st.isEmpty()) {
                    st.pop();
                } else {
                    moves++;
                }
            }
        }

        return moves + st.size();
    }
}