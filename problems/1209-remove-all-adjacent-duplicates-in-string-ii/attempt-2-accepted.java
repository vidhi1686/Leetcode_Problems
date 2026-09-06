class Solution {
    public String removeDuplicates(String s, int k) {

        char[] result = new char[s.length()];
        int[] count = new int[s.length()];

        int size = 0;

        for (int i = 0; i < s.length(); i++) {

            result[size] = s.charAt(i);

            if (size > 0 && result[size] == result[size - 1]) {
                count[size] = count[size - 1] + 1;
            } else {
                count[size] = 1;
            }

            size++;

            if (count[size - 1] == k) {
                size = size - k;
            }
        }

        return new String(result, 0, size);
    }
}

