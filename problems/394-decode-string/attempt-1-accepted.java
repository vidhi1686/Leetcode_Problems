class Solution {

    int index = 0;

    public String decodeString(String s) {

        String ans = "";

        while (index < s.length() && s.charAt(index) != ']') {

            char ch = s.charAt(index);

           
            if (ch >= 'a' && ch <= 'z') {
                ans = ans + ch;
                index++;
            }

            
            else {
                int num = 0;

                while (s.charAt(index) >= '0' && s.charAt(index) <= '9') {
                    num = num * 10 + (s.charAt(index) - '0');
                    index++;
                }

                index++; 

                String inside = decodeString(s);

                index++; 

                for (int i = 0; i < num; i++) {
                    ans = ans + inside;
                }
            }
        }

        return ans;
    }
}