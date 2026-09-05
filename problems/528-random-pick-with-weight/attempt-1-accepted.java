class Solution {

    int[] prefix;
    int total;

    public Solution(int[] w) {

        prefix = new int[w.length];

        int sum = 0;

        for (int i = 0; i < w.length; i++) {
            sum = sum + w[i];
            prefix[i] = sum;
        }

        total = sum;
    }

    public int pickIndex() {

        int random = (int)(Math.random() * total) + 1;

        for (int i = 0; i < prefix.length; i++) {

            if (random <= prefix[i]) {
                return i;
            }
        }

        return -1;
    }
}